.class final Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;
.super Landroid/widget/TextView;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public ε:Z

.field public ζ:I

.field public η:I

.field public θ:Z

.field public ι:Z

.field public κ:F

.field public final λ:[I

.field public final μ:[F

.field public final ν:Landroid/graphics/Matrix;

.field public ξ:Landroid/graphics/LinearGradient;

.field public ο:I

.field public π:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 5
    .line 6
    .line 7
    const/high16 p1, -0x80000000

    .line 8
    .line 9
    iput p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->η:I

    .line 10
    .line 11
    const/high16 p1, -0x40800000    # -1.0f

    .line 12
    .line 13
    iput p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->κ:F

    .line 14
    .line 15
    const/16 p1, 0x8

    .line 16
    .line 17
    new-array p1, p1, [I

    .line 18
    .line 19
    iput-object p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->λ:[I

    .line 20
    .line 21
    const/4 p1, 0x3

    .line 22
    new-array p1, p1, [F

    .line 23
    .line 24
    iput-object p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->μ:[F

    .line 25
    .line 26
    new-instance p1, Landroid/graphics/Matrix;

    .line 27
    .line 28
    invoke-direct {p1}, Landroid/graphics/Matrix;-><init>()V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ν:Landroid/graphics/Matrix;

    .line 32
    .line 33
    const/4 p1, -0x1

    .line 34
    iput p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ο:I

    .line 35
    .line 36
    return-void
.end method

.method public static β(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;F)V
    .locals 5

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_2

    .line 5
    .line 6
    const/4 v2, 0x2

    .line 7
    if-eq v0, v2, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    iget-object v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->μ:[F

    .line 11
    .line 12
    const/high16 v3, 0x3f800000    # 1.0f

    .line 13
    .line 14
    rem-float/2addr p1, v3

    .line 15
    const/high16 v4, 0x43b40000    # 360.0f

    .line 16
    .line 17
    mul-float/2addr p1, v4

    .line 18
    const/4 v4, 0x0

    .line 19
    aput p1, v0, v4

    .line 20
    .line 21
    const p1, 0x3f47ae14    # 0.78f

    .line 22
    .line 23
    .line 24
    aput p1, v0, v1

    .line 25
    .line 26
    aput v3, v0, v2

    .line 27
    .line 28
    invoke-static {v0}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const/4 v1, 0x0

    .line 37
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eq v0, p1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 47
    .line 48
    .line 49
    :cond_1
    const/high16 v0, 0x40400000    # 3.0f

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    invoke-virtual {p0, v0, v1, v1, p1}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 53
    .line 54
    .line 55
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :catchall_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_2
    invoke-virtual {p0, p1, v1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->α(FZ)V

    .line 64
    .line 65
    .line 66
    return-void
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/widget/TextView;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lg20;->β:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    sget-boolean v0, Lg20;->γ:Z

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    sput-boolean v0, Lg20;->γ:Z

    .line 17
    .line 18
    sget-object v0, Lg20;->α:Landroid/os/Handler;

    .line 19
    .line 20
    sget-object v1, Lg20;->δ:Lcom/example/dyhelper/hook/β;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 23
    .line 24
    .line 25
    :cond_0
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ()V

    .line 26
    .line 27
    .line 28
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->δ()V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lg20;->α:Landroid/os/Handler;

    .line 5
    .line 6
    sget-object v0, Lg20;->β:Ljava/util/WeakHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    sget-object v0, Lg20;->α:Landroid/os/Handler;

    .line 18
    .line 19
    sget-object v1, Lg20;->δ:Lcom/example/dyhelper/hook/β;

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 22
    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    sput-boolean v0, Lg20;->γ:Z

    .line 26
    .line 27
    :cond_0
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε()V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-lez v0, :cond_1

    .line 13
    .line 14
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    sget v0, Lh20;->δ:F

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    invoke-virtual {p0, v0, v2}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->α(FZ)V

    .line 33
    .line 34
    .line 35
    :cond_0
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ι:Z

    .line 40
    .line 41
    if-nez v0, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_1

    .line 48
    .line 49
    iput-boolean v1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ι:Z

    .line 50
    .line 51
    new-instance v0, Lcom/example/dyhelper/hook/α;

    .line 52
    .line 53
    const/4 v1, 0x1

    .line 54
    invoke-direct {v0, p0, v1}, Lcom/example/dyhelper/hook/α;-><init>(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/TextView;->onDraw(Landroid/graphics/Canvas;)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-eq p1, p3, :cond_0

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    iput-object p2, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ξ:Landroid/graphics/LinearGradient;

    .line 8
    .line 9
    const/4 p2, -0x1

    .line 10
    iput p2, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ο:I

    .line 11
    .line 12
    :cond_0
    iget p2, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 13
    .line 14
    if-eqz p2, :cond_2

    .line 15
    .line 16
    if-lez p1, :cond_2

    .line 17
    .line 18
    iget-boolean p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 19
    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->δ()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    sget p1, Lh20;->δ:F

    .line 27
    .line 28
    invoke-static {p0, p1}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->β(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;F)V

    .line 29
    .line 30
    .line 31
    :cond_2
    return-void
.end method

.method public final onTextChanged(Ljava/lang/CharSequence;III)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->onTextChanged(Ljava/lang/CharSequence;III)V

    .line 2
    .line 3
    .line 4
    iget p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    new-instance p1, Lcom/example/dyhelper/hook/α;

    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-direct {p1, p0, p2}, Lcom/example/dyhelper/hook/α;-><init>(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public final α(FZ)V
    .locals 12

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-float v4, v0

    .line 6
    const/4 v0, 0x0

    .line 7
    cmpg-float v1, v4, v0

    .line 8
    .line 9
    if-gtz v1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_1

    .line 12
    .line 13
    :cond_0
    iget-object v1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ξ:Landroid/graphics/LinearGradient;

    .line 14
    .line 15
    const/4 v9, 0x1

    .line 16
    const/4 v10, 0x0

    .line 17
    iget-object v11, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->λ:[I

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    iget v2, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ο:I

    .line 22
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eq v2, v3, :cond_3

    .line 28
    .line 29
    :cond_1
    array-length v1, v11

    .line 30
    move v2, v10

    .line 31
    :goto_0
    if-ge v2, v1, :cond_2

    .line 32
    .line 33
    int-to-float v3, v2

    .line 34
    array-length v5, v11

    .line 35
    int-to-float v5, v5

    .line 36
    const/high16 v6, 0x3f800000    # 1.0f

    .line 37
    .line 38
    sub-float/2addr v5, v6

    .line 39
    div-float/2addr v3, v5

    .line 40
    const/high16 v5, 0x43b40000    # 360.0f

    .line 41
    .line 42
    mul-float/2addr v3, v5

    .line 43
    iget-object v5, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->μ:[F

    .line 44
    .line 45
    aput v3, v5, v10

    .line 46
    .line 47
    const v3, 0x3f47ae14    # 0.78f

    .line 48
    .line 49
    .line 50
    aput v3, v5, v9

    .line 51
    .line 52
    const/4 v3, 0x2

    .line 53
    aput v6, v5, v3

    .line 54
    .line 55
    invoke-static {v5}, Landroid/graphics/Color;->HSVToColor([F)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    aput v3, v11, v2

    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    new-instance v1, Landroid/graphics/LinearGradient;

    .line 65
    .line 66
    const/4 v7, 0x0

    .line 67
    sget-object v8, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    .line 68
    .line 69
    const/4 v2, 0x0

    .line 70
    const/4 v3, 0x0

    .line 71
    const/4 v5, 0x0

    .line 72
    iget-object v6, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->λ:[I

    .line 73
    .line 74
    invoke-direct/range {v1 .. v8}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 75
    .line 76
    .line 77
    iput-object v1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ξ:Landroid/graphics/LinearGradient;

    .line 78
    .line 79
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    iput v2, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ο:I

    .line 84
    .line 85
    :cond_3
    iget-object v2, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ν:Landroid/graphics/Matrix;

    .line 86
    .line 87
    invoke-virtual {v2}, Landroid/graphics/Matrix;->reset()V

    .line 88
    .line 89
    .line 90
    mul-float/2addr v4, p1

    .line 91
    invoke-virtual {v2, v4, v0}, Landroid/graphics/Matrix;->setTranslate(FF)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1, v2}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    invoke-virtual {v2}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    if-eq v2, v1, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 112
    .line 113
    .line 114
    :cond_4
    array-length v1, v11

    .line 115
    sub-int/2addr v1, v9

    .line 116
    int-to-float v1, v1

    .line 117
    mul-float/2addr p1, v1

    .line 118
    float-to-int p1, p1

    .line 119
    array-length v1, v11

    .line 120
    sub-int/2addr v1, v9

    .line 121
    invoke-static {p1, v10, v1}, Lj81;->μ(III)I

    .line 122
    .line 123
    .line 124
    move-result p1

    .line 125
    const/high16 v1, 0x40400000    # 3.0f

    .line 126
    .line 127
    aget p1, v11, p1

    .line 128
    .line 129
    invoke-virtual {p0, v1, v0, v0, p1}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 130
    .line 131
    .line 132
    if-eqz p2, :cond_5

    .line 133
    .line 134
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :catchall_0
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 139
    .line 140
    .line 141
    :cond_5
    :goto_1
    return-void
.end method

.method public final γ(Z)V
    .locals 1

    .line 1
    iput-boolean p1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->θ:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    const/4 v0, 0x4

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method public final δ()V
    .locals 3

    .line 1
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    iput v1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ζ:I

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 9
    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    iput-boolean v1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 13
    .line 14
    sget-object v0, Lh20;->β:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {v0, p0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-boolean v0, Lh20;->γ:Z

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    sput-boolean v1, Lh20;->γ:Z

    .line 26
    .line 27
    sget-object v0, Lh20;->α:Landroid/os/Handler;

    .line 28
    .line 29
    sget-object v1, Lh20;->ε:Lcom/example/dyhelper/hook/β;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-lez v0, :cond_2

    .line 39
    .line 40
    sget v0, Lh20;->δ:F

    .line 41
    .line 42
    invoke-static {p0, v0}, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->β(Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;F)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public final ε()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Landroid/graphics/Paint;->getShader()Landroid/graphics/Shader;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    iput-boolean v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->ε:Z

    .line 18
    .line 19
    sget-object v1, Lh20;->β:Ljava/util/WeakHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, p0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/util/WeakHashMap;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    sget-object v1, Lh20;->α:Landroid/os/Handler;

    .line 31
    .line 32
    sget-object v2, Lh20;->ε:Lcom/example/dyhelper/hook/β;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 35
    .line 36
    .line 37
    sput-boolean v0, Lh20;->γ:Z

    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 45
    .line 46
    .line 47
    const/4 v1, 0x0

    .line 48
    invoke-virtual {p0, v1, v1, v1, v0}, Landroid/widget/TextView;->setShadowLayer(FFFI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 52
    .line 53
    .line 54
    return-void
.end method

.method public final ζ()V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->π:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_d

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_7

    .line 14
    .line 15
    :cond_0
    iget-boolean v1, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->θ:Z

    .line 16
    .line 17
    const/4 v2, 0x4

    .line 18
    const/4 v3, 0x0

    .line 19
    if-eqz v1, :cond_a

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_a

    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    goto :goto_5

    .line 34
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    instance-of v4, v0, Landroid/view/View;

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    check-cast v0, Landroid/view/View;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    move-object v0, v5

    .line 51
    :goto_0
    const/4 v4, 0x0

    .line 52
    move v6, v4

    .line 53
    :goto_1
    if-eqz v0, :cond_5

    .line 54
    .line 55
    const/4 v7, 0x3

    .line 56
    if-ge v6, v7, :cond_5

    .line 57
    .line 58
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    if-eqz v7, :cond_3

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getAlpha()F

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    mul-float/2addr v1, v7

    .line 70
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    instance-of v7, v0, Landroid/view/View;

    .line 75
    .line 76
    if-eqz v7, :cond_4

    .line 77
    .line 78
    check-cast v0, Landroid/view/View;

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object v0, v5

    .line 82
    :goto_2
    add-int/lit8 v6, v6, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    move v3, v1

    .line 86
    :goto_3
    iget v0, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->κ:F

    .line 87
    .line 88
    cmpg-float v0, v3, v0

    .line 89
    .line 90
    if-nez v0, :cond_6

    .line 91
    .line 92
    goto :goto_7

    .line 93
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    cmpg-float v0, v0, v3

    .line 98
    .line 99
    if-nez v0, :cond_7

    .line 100
    .line 101
    goto :goto_4

    .line 102
    :cond_7
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 103
    .line 104
    .line 105
    :goto_4
    const v0, 0x3c23d70a    # 0.01f

    .line 106
    .line 107
    .line 108
    cmpl-float v0, v3, v0

    .line 109
    .line 110
    if-lez v0, :cond_8

    .line 111
    .line 112
    move v2, v4

    .line 113
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eq v0, v2, :cond_9

    .line 118
    .line 119
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 120
    .line 121
    .line 122
    :cond_9
    iput v3, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->κ:F

    .line 123
    .line 124
    return-void

    .line 125
    :cond_a
    :goto_5
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    if-eq v0, v2, :cond_b

    .line 130
    .line 131
    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 132
    .line 133
    .line 134
    :cond_b
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    cmpg-float v0, v0, v3

    .line 139
    .line 140
    if-nez v0, :cond_c

    .line 141
    .line 142
    goto :goto_6

    .line 143
    :cond_c
    invoke-virtual {p0, v3}, Landroid/view/View;->setAlpha(F)V

    .line 144
    .line 145
    .line 146
    :goto_6
    iput v3, p0, Lcom/example/dyhelper/hook/FeedInfoBarHook$NeonTextView;->κ:F

    .line 147
    .line 148
    :cond_d
    :goto_7
    return-void
.end method
