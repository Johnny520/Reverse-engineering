.class public final L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪兰哲世苏:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:[F

.field public 飘花落叶言子楪世兰苏哲:[F

.field public 飘花落叶言子楪世哲兰苏:[F

.field public 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:I

.field public 飘花落叶言子楪世苏哲兰:I

.field public final 飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

.field public 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰苏世哲:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

.field public final 飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

.field public final 飘花落叶言子楪哲世兰苏:F

.field public final 飘花落叶言子楪哲世苏兰:F

.field public final 飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子楪哲兰苏世:Landroid/view/View;

.field public final 飘花落叶言子楪哲苏世兰:I

.field public final 飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

.field public 飘花落叶言子楪苏世兰哲:[I

.field public 飘花落叶言子楪苏世哲兰:[F

.field public 飘花落叶言子楪苏兰世哲:I

.field public 飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

.field public 飘花落叶言子楪苏哲世兰:[I

.field public 飘花落叶言子楪苏哲兰世:[I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, -0x1

    .line 5
    iput v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 6
    .line 7
    new-instance v0, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 8
    .line 9
    const/16 v1, 0x13

    .line 10
    .line 11
    invoke-direct {v0, p0, v1}, Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;-><init>(Ljava/lang/Object;I)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    iput-object p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

    .line 19
    .line 20
    iput-object p3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 21
    .line 22
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-virtual {p3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    iget p3, p3, Landroid/util/DisplayMetrics;->density:F

    .line 35
    .line 36
    const/high16 v0, 0x41a00000    # 20.0f

    .line 37
    .line 38
    mul-float/2addr p3, v0

    .line 39
    const/high16 v0, 0x3f000000    # 0.5f

    .line 40
    .line 41
    add-float/2addr p3, v0

    .line 42
    float-to-int p3, p3

    .line 43
    iput p3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰:I

    .line 44
    .line 45
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 46
    .line 47
    .line 48
    move-result p3

    .line 49
    iput p3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 50
    .line 51
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    int-to-float p3, p3

    .line 56
    iput p3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰:F

    .line 57
    .line 58
    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    int-to-float p2, p2

    .line 63
    iput p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏:F

    .line 64
    .line 65
    sget-object p2, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 66
    .line 67
    iput-object p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 68
    .line 69
    new-instance p2, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世哲兰苏;

    .line 70
    .line 71
    invoke-direct {p2, p0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;)V

    .line 72
    .line 73
    .line 74
    new-instance p3, Landroid/widget/OverScroller;

    .line 75
    .line 76
    invoke-direct {p3, p1, p2}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 77
    .line 78
    .line 79
    iput-object p3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 80
    .line 81
    return-void

    .line 82
    :cond_0
    const-string p0, "Callback may not be null"

    .line 83
    .line 84
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    const/4 p0, 0x0

    .line 88
    throw p0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Z)Z
    .locals 10

    .line 1
    iget v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    if-ne v0, v2, :cond_6

    .line 6
    .line 7
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/widget/OverScroller;->computeScrollOffset()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    .line 18
    .line 19
    .line 20
    move-result v7

    .line 21
    iget-object v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    sub-int v8, v6, v4

    .line 28
    .line 29
    iget-object v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 30
    .line 31
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    sub-int v9, v7, v4

    .line 36
    .line 37
    if-eqz v8, :cond_0

    .line 38
    .line 39
    iget-object v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 40
    .line 41
    sget-object v5, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 42
    .line 43
    invoke-virtual {v4, v8}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 44
    .line 45
    .line 46
    :cond_0
    if-eqz v9, :cond_1

    .line 47
    .line 48
    iget-object v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 49
    .line 50
    sget-object v5, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {v4, v9}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 53
    .line 54
    .line 55
    :cond_1
    if-nez v8, :cond_2

    .line 56
    .line 57
    if-eqz v9, :cond_3

    .line 58
    .line 59
    :cond_2
    iget-object v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 60
    .line 61
    iget-object v5, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual/range {v4 .. v9}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪哲兰(Landroid/view/View;IIII)V

    .line 64
    .line 65
    .line 66
    :cond_3
    if-eqz v3, :cond_4

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-ne v6, v4, :cond_4

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-ne v7, v4, :cond_4

    .line 79
    .line 80
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 81
    .line 82
    .line 83
    move v3, v1

    .line 84
    :cond_4
    if-nez v3, :cond_6

    .line 85
    .line 86
    if-eqz p1, :cond_5

    .line 87
    .line 88
    iget-object p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

    .line 89
    .line 90
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 93
    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_5
    invoke-virtual {p0, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 97
    .line 98
    .line 99
    :cond_6
    :goto_0
    iget p0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 100
    .line 101
    if-ne p0, v2, :cond_7

    .line 102
    .line 103
    const/4 p0, 0x1

    .line 104
    return p0

    .line 105
    :cond_7
    return v1
.end method

.method public final 飘花落叶言子楪世兰苏哲(III)I
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    iget-object p0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    div-int/lit8 v0, p0, 0x2

    .line 12
    .line 13
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    int-to-float p0, p0

    .line 19
    div-float/2addr v1, p0

    .line 20
    const/high16 p0, 0x3f800000    # 1.0f

    .line 21
    .line 22
    invoke-static {p0, v1}, Ljava/lang/Math;->min(FF)F

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    int-to-float v0, v0

    .line 27
    const/high16 v2, 0x3f000000    # 0.5f

    .line 28
    .line 29
    sub-float/2addr v1, v2

    .line 30
    const v2, 0x3ef1463b

    .line 31
    .line 32
    .line 33
    mul-float/2addr v1, v2

    .line 34
    float-to-double v1, v1

    .line 35
    invoke-static {v1, v2}, Ljava/lang/Math;->sin(D)D

    .line 36
    .line 37
    .line 38
    move-result-wide v1

    .line 39
    double-to-float v1, v1

    .line 40
    mul-float/2addr v1, v0

    .line 41
    add-float/2addr v1, v0

    .line 42
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    .line 43
    .line 44
    .line 45
    move-result p2

    .line 46
    if-lez p2, :cond_1

    .line 47
    .line 48
    int-to-float p0, p2

    .line 49
    div-float/2addr v1, p0

    .line 50
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    const/high16 p1, 0x447a0000    # 1000.0f

    .line 55
    .line 56
    mul-float/2addr p0, p1

    .line 57
    invoke-static {p0}, Ljava/lang/Math;->round(F)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    mul-int/lit8 p0, p0, 0x4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    int-to-float p1, p1

    .line 69
    int-to-float p2, p3

    .line 70
    div-float/2addr p1, p2

    .line 71
    add-float/2addr p1, p0

    .line 72
    const/high16 p0, 0x43800000    # 256.0f

    .line 73
    .line 74
    mul-float/2addr p1, p0

    .line 75
    float-to-int p0, p1

    .line 76
    :goto_0
    const/16 p1, 0x258

    .line 77
    .line 78
    invoke-static {p0, p1}, Ljava/lang/Math;->min(II)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    return p0
.end method

.method public final 飘花落叶言子楪世哲兰苏(I)V
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    shl-int/2addr v2, p1

    .line 9
    and-int v3, v1, v2

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    aput v3, v0, p1

    .line 15
    .line 16
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 17
    .line 18
    aput v3, v0, p1

    .line 19
    .line 20
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:[F

    .line 21
    .line 22
    aput v3, v0, p1

    .line 23
    .line 24
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[F

    .line 25
    .line 26
    aput v3, v0, p1

    .line 27
    .line 28
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    aput v3, v0, p1

    .line 32
    .line 33
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:[I

    .line 34
    .line 35
    aput v3, v0, p1

    .line 36
    .line 37
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世:[I

    .line 38
    .line 39
    aput v3, v0, p1

    .line 40
    .line 41
    not-int p1, v2

    .line 42
    and-int/2addr p1, v1

    .line 43
    iput p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroid/view/View;FF)Z
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_3

    .line 5
    :cond_0
    iget-object v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏(Landroid/view/View;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    const/4 v2, 0x1

    .line 12
    if-lez p1, :cond_1

    .line 13
    .line 14
    move p1, v2

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move p1, v0

    .line 17
    :goto_0
    invoke-virtual {v1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲苏世()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_2

    .line 22
    .line 23
    move v1, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_2
    move v1, v0

    .line 26
    :goto_1
    iget p0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲:I

    .line 27
    .line 28
    if-eqz p1, :cond_3

    .line 29
    .line 30
    if-eqz v1, :cond_3

    .line 31
    .line 32
    mul-float/2addr p2, p2

    .line 33
    mul-float/2addr p3, p3

    .line 34
    add-float/2addr p3, p2

    .line 35
    mul-int/2addr p0, p0

    .line 36
    int-to-float p0, p0

    .line 37
    cmpl-float p0, p3, p0

    .line 38
    .line 39
    if-lez p0, :cond_5

    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_3
    if-eqz p1, :cond_4

    .line 43
    .line 44
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    int-to-float p0, p0

    .line 49
    cmpl-float p0, p1, p0

    .line 50
    .line 51
    if-lez p0, :cond_5

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_4
    if-eqz v1, :cond_5

    .line 55
    .line 56
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    int-to-float p0, p0

    .line 61
    cmpl-float p0, p1, p0

    .line 62
    .line 63
    if-lez p0, :cond_5

    .line 64
    .line 65
    :goto_2
    return v2

    .line 66
    :cond_5
    :goto_3
    return v0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 10
    .line 11
    iput p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 12
    .line 13
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰苏哲(Landroid/view/View;I)V

    .line 16
    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    invoke-virtual {p0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("

    .line 24
    .line 25
    const-string p1, ")"

    .line 26
    .line 27
    invoke-static {v1, p0, p1}, L飘花落叶言苏世楪兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iput v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 3
    .line 4
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v1, 0x0

    .line 10
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:[F

    .line 19
    .line 20
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[F

    .line 24
    .line 25
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 32
    .line 33
    .line 34
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:[I

    .line 35
    .line 36
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世:[I

    .line 40
    .line 41
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([II)V

    .line 42
    .line 43
    .line 44
    iput v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 45
    .line 46
    :goto_0
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 47
    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 51
    .line 52
    .line 53
    const/4 v0, 0x0

    .line 54
    iput-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 55
    .line 56
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(II)Z
    .locals 3

    .line 1
    iget-boolean v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 6
    .line 7
    iget v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    float-to-int v0, v0

    .line 14
    iget-object v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 15
    .line 16
    iget v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    float-to-int v1, v1

    .line 23
    invoke-virtual {p0, p1, p2, v0, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(IIII)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    return p0

    .line 28
    :cond_0
    const-string p0, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"

    .line 29
    .line 30
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x0

    .line 34
    return p0
.end method

.method public final 飘花落叶言子楪哲世苏兰(I)V
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:Landroidx/appcompat/app/飘花落叶言子世兰楪哲苏;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 6
    .line 7
    .line 8
    iget v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    if-eq v0, p1, :cond_0

    .line 11
    .line 12
    iput p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 13
    .line 14
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世楪兰哲苏(I)V

    .line 17
    .line 18
    .line 19
    iget p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    iput-object p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z
    .locals 2

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    iget v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 7
    .line 8
    if-ne v0, p2, :cond_0

    .line 9
    .line 10
    return v1

    .line 11
    :cond_0
    if-eqz p1, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 14
    .line 15
    invoke-virtual {v0, p1, p2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲苏楪兰(Landroid/view/View;I)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    iput p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 22
    .line 23
    invoke-virtual {p0, p1, p2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(Landroid/view/View;I)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :cond_1
    const/4 p0, 0x0

    .line 28
    return p0
.end method

.method public final 飘花落叶言子楪哲苏世兰(Landroid/view/MotionEvent;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iput-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 27
    .line 28
    :cond_1
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 29
    .line 30
    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 31
    .line 32
    .line 33
    const/4 v5, 0x2

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_d

    .line 36
    .line 37
    if-eq v2, v6, :cond_c

    .line 38
    .line 39
    if-eq v2, v5, :cond_5

    .line 40
    .line 41
    const/4 v7, 0x3

    .line 42
    if-eq v2, v7, :cond_c

    .line 43
    .line 44
    const/4 v7, 0x5

    .line 45
    if-eq v2, v7, :cond_3

    .line 46
    .line 47
    const/4 v5, 0x6

    .line 48
    if-eq v2, v5, :cond_2

    .line 49
    .line 50
    goto/16 :goto_2

    .line 51
    .line 52
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    invoke-virtual {v0, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(I)V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :cond_3
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    invoke-virtual {v0, v7, v1, v2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(FFI)V

    .line 74
    .line 75
    .line 76
    iget v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 77
    .line 78
    if-nez v3, :cond_4

    .line 79
    .line 80
    iget-object v1, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 81
    .line 82
    aget v1, v1, v2

    .line 83
    .line 84
    goto/16 :goto_2

    .line 85
    .line 86
    :cond_4
    if-ne v3, v5, :cond_f

    .line 87
    .line 88
    float-to-int v3, v7

    .line 89
    float-to-int v1, v1

    .line 90
    invoke-virtual {v0, v3, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(II)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    iget-object v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 95
    .line 96
    if-ne v1, v3, :cond_f

    .line 97
    .line 98
    invoke-virtual {v0, v1, v2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 99
    .line 100
    .line 101
    goto/16 :goto_2

    .line 102
    .line 103
    :cond_5
    iget-object v2, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 104
    .line 105
    if-eqz v2, :cond_f

    .line 106
    .line 107
    iget-object v2, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 108
    .line 109
    if-nez v2, :cond_6

    .line 110
    .line 111
    goto/16 :goto_2

    .line 112
    .line 113
    :cond_6
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    const/4 v3, 0x0

    .line 118
    :goto_0
    if-ge v3, v2, :cond_b

    .line 119
    .line 120
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    iget v7, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 125
    .line 126
    shl-int v8, v6, v5

    .line 127
    .line 128
    and-int/2addr v7, v8

    .line 129
    if-eqz v7, :cond_a

    .line 130
    .line 131
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 132
    .line 133
    .line 134
    move-result v7

    .line 135
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 136
    .line 137
    .line 138
    move-result v8

    .line 139
    iget-object v9, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 140
    .line 141
    aget v9, v9, v5

    .line 142
    .line 143
    sub-float v9, v7, v9

    .line 144
    .line 145
    iget-object v10, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 146
    .line 147
    aget v10, v10, v5

    .line 148
    .line 149
    sub-float v10, v8, v10

    .line 150
    .line 151
    float-to-int v7, v7

    .line 152
    float-to-int v8, v8

    .line 153
    invoke-virtual {v0, v7, v8}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(II)Landroid/view/View;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    invoke-virtual {v0, v7, v9, v10}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Landroid/view/View;FF)Z

    .line 158
    .line 159
    .line 160
    move-result v8

    .line 161
    if-eqz v8, :cond_8

    .line 162
    .line 163
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    float-to-int v12, v9

    .line 168
    add-int/2addr v12, v11

    .line 169
    iget-object v13, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 170
    .line 171
    invoke-virtual {v13, v7, v12}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/view/View;I)I

    .line 172
    .line 173
    .line 174
    move-result v12

    .line 175
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 176
    .line 177
    .line 178
    move-result v14

    .line 179
    float-to-int v15, v10

    .line 180
    add-int v4, v14, v15

    .line 181
    .line 182
    invoke-virtual {v13, v7, v4, v15}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Landroid/view/View;II)I

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    invoke-virtual {v13, v7}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏(Landroid/view/View;)I

    .line 187
    .line 188
    .line 189
    move-result v15

    .line 190
    invoke-virtual {v13}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲苏世()I

    .line 191
    .line 192
    .line 193
    move-result v13

    .line 194
    if-eqz v15, :cond_7

    .line 195
    .line 196
    if-lez v15, :cond_8

    .line 197
    .line 198
    if-ne v12, v11, :cond_8

    .line 199
    .line 200
    :cond_7
    if-eqz v13, :cond_b

    .line 201
    .line 202
    if-lez v13, :cond_8

    .line 203
    .line 204
    if-ne v4, v14, :cond_8

    .line 205
    .line 206
    goto :goto_1

    .line 207
    :cond_8
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 208
    .line 209
    .line 210
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 211
    .line 212
    .line 213
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 214
    .line 215
    aget v4, v4, v5

    .line 216
    .line 217
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 218
    .line 219
    .line 220
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 221
    .line 222
    .line 223
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 224
    .line 225
    aget v4, v4, v5

    .line 226
    .line 227
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 228
    .line 229
    .line 230
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 231
    .line 232
    .line 233
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 234
    .line 235
    aget v4, v4, v5

    .line 236
    .line 237
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 238
    .line 239
    .line 240
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 241
    .line 242
    .line 243
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 244
    .line 245
    aget v4, v4, v5

    .line 246
    .line 247
    iget v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 248
    .line 249
    if-ne v4, v6, :cond_9

    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_9
    if-eqz v8, :cond_a

    .line 253
    .line 254
    invoke-virtual {v0, v7, v5}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-eqz v4, :cond_a

    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 262
    .line 263
    goto/16 :goto_0

    .line 264
    .line 265
    :cond_b
    :goto_1
    invoke-virtual/range {p0 .. p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世(Landroid/view/MotionEvent;)V

    .line 266
    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_c
    invoke-virtual {v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 270
    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_d
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 274
    .line 275
    .line 276
    move-result v2

    .line 277
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 278
    .line 279
    .line 280
    move-result v3

    .line 281
    const/4 v4, 0x0

    .line 282
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 283
    .line 284
    .line 285
    move-result v1

    .line 286
    invoke-virtual {v0, v2, v3, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(FFI)V

    .line 287
    .line 288
    .line 289
    float-to-int v2, v2

    .line 290
    float-to-int v3, v3

    .line 291
    invoke-virtual {v0, v2, v3}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(II)Landroid/view/View;

    .line 292
    .line 293
    .line 294
    move-result-object v2

    .line 295
    iget-object v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 296
    .line 297
    if-ne v2, v3, :cond_e

    .line 298
    .line 299
    iget v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 300
    .line 301
    if-ne v3, v5, :cond_e

    .line 302
    .line 303
    invoke-virtual {v0, v2, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 304
    .line 305
    .line 306
    :cond_e
    iget-object v2, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 307
    .line 308
    aget v1, v2, v1

    .line 309
    .line 310
    :cond_f
    :goto_2
    iget v0, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 311
    .line 312
    if-ne v0, v6, :cond_10

    .line 313
    .line 314
    return v6

    .line 315
    :cond_10
    const/16 v16, 0x0

    .line 316
    .line 317
    return v16
.end method

.method public final 飘花落叶言子楪哲苏兰世(Landroid/view/View;II)Z
    .locals 0

    .line 1
    iput-object p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 2
    .line 3
    const/4 p1, -0x1

    .line 4
    iput p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    invoke-virtual {p0, p2, p3, p1, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲(IIII)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    iget p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    iget-object p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 18
    .line 19
    if-eqz p2, :cond_0

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    iput-object p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 23
    .line 24
    :cond_0
    return p1
.end method

.method public final 飘花落叶言子楪苏世兰哲(IIII)Z
    .locals 10

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    sub-int v4, p1, v2

    .line 14
    .line 15
    sub-int v5, p2, v3

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iget-object v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroid/widget/OverScroller;

    .line 19
    .line 20
    if-nez v4, :cond_0

    .line 21
    .line 22
    if-nez v5, :cond_0

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 28
    .line 29
    .line 30
    return p1

    .line 31
    :cond_0
    iget-object p2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 32
    .line 33
    iget v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏:F

    .line 34
    .line 35
    float-to-int v0, v0

    .line 36
    iget v6, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰:F

    .line 37
    .line 38
    float-to-int v6, v6

    .line 39
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-ge v7, v0, :cond_1

    .line 44
    .line 45
    move p3, p1

    .line 46
    goto :goto_0

    .line 47
    :cond_1
    if-le v7, v6, :cond_3

    .line 48
    .line 49
    if-lez p3, :cond_2

    .line 50
    .line 51
    move p3, v6

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    neg-int p3, v6

    .line 54
    :cond_3
    :goto_0
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 55
    .line 56
    .line 57
    move-result v7

    .line 58
    if-ge v7, v0, :cond_4

    .line 59
    .line 60
    move p4, p1

    .line 61
    goto :goto_1

    .line 62
    :cond_4
    if-le v7, v6, :cond_6

    .line 63
    .line 64
    if-lez p4, :cond_5

    .line 65
    .line 66
    move p4, v6

    .line 67
    goto :goto_1

    .line 68
    :cond_5
    neg-int p4, v6

    .line 69
    :cond_6
    :goto_1
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 78
    .line 79
    .line 80
    move-result v6

    .line 81
    invoke-static {p4}, Ljava/lang/Math;->abs(I)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    add-int v8, v6, v7

    .line 86
    .line 87
    add-int v9, p1, v0

    .line 88
    .line 89
    if-eqz p3, :cond_7

    .line 90
    .line 91
    int-to-float p1, v6

    .line 92
    int-to-float v6, v8

    .line 93
    :goto_2
    div-float/2addr p1, v6

    .line 94
    goto :goto_3

    .line 95
    :cond_7
    int-to-float p1, p1

    .line 96
    int-to-float v6, v9

    .line 97
    goto :goto_2

    .line 98
    :goto_3
    if-eqz p4, :cond_8

    .line 99
    .line 100
    int-to-float v0, v7

    .line 101
    int-to-float v6, v8

    .line 102
    :goto_4
    div-float/2addr v0, v6

    .line 103
    goto :goto_5

    .line 104
    :cond_8
    int-to-float v0, v0

    .line 105
    int-to-float v6, v9

    .line 106
    goto :goto_4

    .line 107
    :goto_5
    iget-object v6, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 108
    .line 109
    invoke-virtual {v6, p2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲世苏(Landroid/view/View;)I

    .line 110
    .line 111
    .line 112
    move-result p2

    .line 113
    invoke-virtual {p0, v4, p3, p2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(III)I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    invoke-virtual {v6}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰哲苏世()I

    .line 118
    .line 119
    .line 120
    move-result p3

    .line 121
    invoke-virtual {p0, v5, p4, p3}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(III)I

    .line 122
    .line 123
    .line 124
    move-result p3

    .line 125
    int-to-float p2, p2

    .line 126
    mul-float/2addr p2, p1

    .line 127
    int-to-float p1, p3

    .line 128
    mul-float/2addr p1, v0

    .line 129
    add-float/2addr p1, p2

    .line 130
    float-to-int v6, p1

    .line 131
    sget-object p1, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲世苏:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 132
    .line 133
    iput-object p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏世哲:L飘花落叶言子兰苏楪哲世/飘花落叶言子楪世苏兰哲;

    .line 134
    .line 135
    invoke-virtual/range {v1 .. v6}, Landroid/widget/OverScroller;->startScroll(IIIII)V

    .line 136
    .line 137
    .line 138
    const/4 p1, 0x2

    .line 139
    invoke-virtual {p0, p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 140
    .line 141
    .line 142
    const/4 p0, 0x1

    .line 143
    return p0
.end method

.method public final 飘花落叶言子楪苏世哲兰(II)Landroid/view/View;
    .locals 4

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-lt p1, v3, :cond_0

    .line 25
    .line 26
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-ge p1, v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-lt p2, v3, :cond_0

    .line 37
    .line 38
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-ge p2, v3, :cond_0

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_0
    add-int/lit8 v1, v1, -0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    const/4 p0, 0x0

    .line 49
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(FFI)V
    .locals 10

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    array-length v2, v0

    .line 7
    if-gt v2, p3, :cond_2

    .line 8
    .line 9
    :cond_0
    add-int/lit8 v2, p3, 0x1

    .line 10
    .line 11
    new-array v3, v2, [F

    .line 12
    .line 13
    new-array v4, v2, [F

    .line 14
    .line 15
    new-array v5, v2, [F

    .line 16
    .line 17
    new-array v6, v2, [F

    .line 18
    .line 19
    new-array v7, v2, [I

    .line 20
    .line 21
    new-array v8, v2, [I

    .line 22
    .line 23
    new-array v2, v2, [I

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    array-length v9, v0

    .line 28
    invoke-static {v0, v1, v3, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 32
    .line 33
    array-length v9, v0

    .line 34
    invoke-static {v0, v1, v4, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:[F

    .line 38
    .line 39
    array-length v9, v0

    .line 40
    invoke-static {v0, v1, v5, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[F

    .line 44
    .line 45
    array-length v9, v0

    .line 46
    invoke-static {v0, v1, v6, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 50
    .line 51
    array-length v9, v0

    .line 52
    invoke-static {v0, v1, v7, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:[I

    .line 56
    .line 57
    array-length v9, v0

    .line 58
    invoke-static {v0, v1, v8, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    .line 60
    .line 61
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世:[I

    .line 62
    .line 63
    array-length v9, v0

    .line 64
    invoke-static {v0, v1, v2, v1, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iput-object v3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 68
    .line 69
    iput-object v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 70
    .line 71
    iput-object v5, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:[F

    .line 72
    .line 73
    iput-object v6, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[F

    .line 74
    .line 75
    iput-object v7, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 76
    .line 77
    iput-object v8, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰:[I

    .line 78
    .line 79
    iput-object v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世:[I

    .line 80
    .line 81
    :cond_2
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 82
    .line 83
    iget-object v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:[F

    .line 84
    .line 85
    aput p1, v2, p3

    .line 86
    .line 87
    aput p1, v0, p3

    .line 88
    .line 89
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 90
    .line 91
    iget-object v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[F

    .line 92
    .line 93
    aput p2, v2, p3

    .line 94
    .line 95
    aput p2, v0, p3

    .line 96
    .line 97
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 98
    .line 99
    float-to-int p1, p1

    .line 100
    float-to-int p2, p2

    .line 101
    iget-object v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏:Landroid/view/ViewGroup;

    .line 102
    .line 103
    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    iget v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰:I

    .line 108
    .line 109
    add-int/2addr v3, v4

    .line 110
    const/4 v5, 0x1

    .line 111
    if-ge p1, v3, :cond_3

    .line 112
    .line 113
    move v1, v5

    .line 114
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    add-int/2addr v3, v4

    .line 119
    if-ge p2, v3, :cond_4

    .line 120
    .line 121
    or-int/lit8 v1, v1, 0x4

    .line 122
    .line 123
    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    sub-int/2addr v3, v4

    .line 128
    if-le p1, v3, :cond_5

    .line 129
    .line 130
    or-int/lit8 v1, v1, 0x2

    .line 131
    .line 132
    :cond_5
    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    sub-int/2addr p1, v4

    .line 137
    if-le p2, p1, :cond_6

    .line 138
    .line 139
    or-int/lit8 v1, v1, 0x8

    .line 140
    .line 141
    :cond_6
    aput v1, v0, p3

    .line 142
    .line 143
    iget p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 144
    .line 145
    shl-int p2, v5, p3

    .line 146
    .line 147
    or-int/2addr p1, p2

    .line 148
    iput p1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 149
    .line 150
    return-void
.end method

.method public final 飘花落叶言子楪苏兰哲世(Landroid/view/MotionEvent;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    iget v3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    shl-int/2addr v4, v2

    .line 16
    and-int/2addr v3, v4

    .line 17
    if-eqz v3, :cond_0

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    iget-object v5, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:[F

    .line 28
    .line 29
    aput v3, v5, v2

    .line 30
    .line 31
    iget-object v3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[F

    .line 32
    .line 33
    aput v4, v3, v2

    .line 34
    .line 35
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪苏哲世兰(Landroid/view/MotionEvent;)V
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 16
    .line 17
    .line 18
    :cond_0
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    iput-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 27
    .line 28
    :cond_1
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 29
    .line 30
    invoke-virtual {v4, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 31
    .line 32
    .line 33
    const/4 v4, 0x0

    .line 34
    if-eqz v2, :cond_19

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    if-eq v2, v5, :cond_17

    .line 38
    .line 39
    const/4 v6, 0x2

    .line 40
    iget-object v7, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 41
    .line 42
    const/4 v8, -0x1

    .line 43
    if-eq v2, v6, :cond_c

    .line 44
    .line 45
    const/4 v6, 0x3

    .line 46
    if-eq v2, v6, :cond_a

    .line 47
    .line 48
    const/4 v6, 0x5

    .line 49
    if-eq v2, v6, :cond_7

    .line 50
    .line 51
    const/4 v6, 0x6

    .line 52
    if-eq v2, v6, :cond_2

    .line 53
    .line 54
    goto/16 :goto_3

    .line 55
    .line 56
    :cond_2
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    iget v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 61
    .line 62
    if-ne v3, v5, :cond_6

    .line 63
    .line 64
    iget v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 65
    .line 66
    if-ne v2, v3, :cond_6

    .line 67
    .line 68
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    :goto_0
    if-ge v4, v3, :cond_5

    .line 73
    .line 74
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    iget v6, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 79
    .line 80
    if-ne v5, v6, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 84
    .line 85
    .line 86
    move-result v6

    .line 87
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 88
    .line 89
    .line 90
    move-result v7

    .line 91
    float-to-int v6, v6

    .line 92
    float-to-int v7, v7

    .line 93
    invoke-virtual {v0, v6, v7}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(II)Landroid/view/View;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iget-object v7, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 98
    .line 99
    if-ne v6, v7, :cond_4

    .line 100
    .line 101
    invoke-virtual {v0, v7, v5}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_4

    .line 106
    .line 107
    iget v1, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :cond_4
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_5
    move v1, v8

    .line 114
    :goto_2
    if-ne v1, v8, :cond_6

    .line 115
    .line 116
    invoke-virtual {v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()V

    .line 117
    .line 118
    .line 119
    :cond_6
    invoke-virtual {v0, v2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(I)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :cond_7
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getX(I)F

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    invoke-virtual {v1, v3}, Landroid/view/MotionEvent;->getY(I)F

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    invoke-virtual {v0, v4, v1, v2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(FFI)V

    .line 136
    .line 137
    .line 138
    iget v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 139
    .line 140
    if-nez v3, :cond_8

    .line 141
    .line 142
    float-to-int v3, v4

    .line 143
    float-to-int v1, v1

    .line 144
    invoke-virtual {v0, v3, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(II)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    invoke-virtual {v0, v1, v2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 149
    .line 150
    .line 151
    iget-object v0, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 152
    .line 153
    aget v0, v0, v2

    .line 154
    .line 155
    return-void

    .line 156
    :cond_8
    float-to-int v3, v4

    .line 157
    float-to-int v1, v1

    .line 158
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 159
    .line 160
    if-nez v4, :cond_9

    .line 161
    .line 162
    goto :goto_3

    .line 163
    :cond_9
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-lt v3, v5, :cond_d

    .line 168
    .line 169
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-ge v3, v5, :cond_d

    .line 174
    .line 175
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 176
    .line 177
    .line 178
    move-result v3

    .line 179
    if-lt v1, v3, :cond_d

    .line 180
    .line 181
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 182
    .line 183
    .line 184
    move-result v3

    .line 185
    if-ge v1, v3, :cond_d

    .line 186
    .line 187
    iget-object v1, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 188
    .line 189
    invoke-virtual {v0, v1, v2}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 190
    .line 191
    .line 192
    return-void

    .line 193
    :cond_a
    iget v1, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 194
    .line 195
    if-ne v1, v5, :cond_b

    .line 196
    .line 197
    iput-boolean v5, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 198
    .line 199
    iget-object v1, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 200
    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-virtual {v7, v1, v2, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪兰哲(Landroid/view/View;FF)V

    .line 203
    .line 204
    .line 205
    iput-boolean v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 206
    .line 207
    iget v1, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 208
    .line 209
    if-ne v1, v5, :cond_b

    .line 210
    .line 211
    invoke-virtual {v0, v4}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 212
    .line 213
    .line 214
    :cond_b
    invoke-virtual {v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 215
    .line 216
    .line 217
    return-void

    .line 218
    :cond_c
    iget v2, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 219
    .line 220
    if-ne v2, v5, :cond_13

    .line 221
    .line 222
    iget v2, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 223
    .line 224
    iget v3, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 225
    .line 226
    shl-int v4, v5, v2

    .line 227
    .line 228
    and-int/2addr v3, v4

    .line 229
    if-eqz v3, :cond_12

    .line 230
    .line 231
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 232
    .line 233
    .line 234
    move-result v2

    .line 235
    if-ne v2, v8, :cond_e

    .line 236
    .line 237
    :cond_d
    :goto_3
    return-void

    .line 238
    :cond_e
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getX(I)F

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-virtual {v1, v2}, Landroid/view/MotionEvent;->getY(I)F

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰哲苏:[F

    .line 247
    .line 248
    iget v5, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 249
    .line 250
    aget v4, v4, v5

    .line 251
    .line 252
    sub-float/2addr v3, v4

    .line 253
    float-to-int v3, v3

    .line 254
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰:[F

    .line 255
    .line 256
    aget v4, v4, v5

    .line 257
    .line 258
    sub-float/2addr v2, v4

    .line 259
    float-to-int v2, v2

    .line 260
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 261
    .line 262
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 263
    .line 264
    .line 265
    move-result v4

    .line 266
    add-int/2addr v4, v3

    .line 267
    iget-object v5, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 268
    .line 269
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    add-int/2addr v5, v2

    .line 274
    iget-object v6, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 275
    .line 276
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    iget-object v8, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 281
    .line 282
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    if-eqz v3, :cond_f

    .line 287
    .line 288
    iget-object v9, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 289
    .line 290
    invoke-virtual {v7, v9, v4}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲(Landroid/view/View;I)I

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    iget-object v9, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 295
    .line 296
    sub-int v10, v4, v6

    .line 297
    .line 298
    sget-object v11, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 299
    .line 300
    invoke-virtual {v9, v10}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 301
    .line 302
    .line 303
    :cond_f
    move v14, v4

    .line 304
    if-eqz v2, :cond_10

    .line 305
    .line 306
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 307
    .line 308
    invoke-virtual {v7, v4, v5, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏(Landroid/view/View;II)I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    iget-object v4, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 313
    .line 314
    sub-int v7, v5, v8

    .line 315
    .line 316
    sget-object v9, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 317
    .line 318
    invoke-virtual {v4, v7}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 319
    .line 320
    .line 321
    :cond_10
    move v15, v5

    .line 322
    if-nez v3, :cond_11

    .line 323
    .line 324
    if-eqz v2, :cond_16

    .line 325
    .line 326
    :cond_11
    sub-int v16, v14, v6

    .line 327
    .line 328
    sub-int v17, v15, v8

    .line 329
    .line 330
    iget-object v12, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 331
    .line 332
    iget-object v13, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 333
    .line 334
    invoke-virtual/range {v12 .. v17}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪哲兰(Landroid/view/View;IIII)V

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_12
    return-void

    .line 339
    :cond_13
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    :goto_4
    if-ge v4, v2, :cond_16

    .line 344
    .line 345
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    iget v6, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 350
    .line 351
    shl-int v7, v5, v3

    .line 352
    .line 353
    and-int/2addr v6, v7

    .line 354
    if-eqz v6, :cond_15

    .line 355
    .line 356
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    iget-object v8, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏:[F

    .line 365
    .line 366
    aget v8, v8, v3

    .line 367
    .line 368
    sub-float v8, v6, v8

    .line 369
    .line 370
    iget-object v9, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲:[F

    .line 371
    .line 372
    aget v9, v9, v3

    .line 373
    .line 374
    sub-float v9, v7, v9

    .line 375
    .line 376
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 377
    .line 378
    .line 379
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 380
    .line 381
    .line 382
    iget-object v10, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 383
    .line 384
    aget v10, v10, v3

    .line 385
    .line 386
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 387
    .line 388
    .line 389
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 390
    .line 391
    .line 392
    iget-object v10, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 393
    .line 394
    aget v10, v10, v3

    .line 395
    .line 396
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 397
    .line 398
    .line 399
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 400
    .line 401
    .line 402
    iget-object v10, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 403
    .line 404
    aget v10, v10, v3

    .line 405
    .line 406
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 407
    .line 408
    .line 409
    invoke-static {v8}, Ljava/lang/Math;->abs(F)F

    .line 410
    .line 411
    .line 412
    iget-object v10, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 413
    .line 414
    aget v10, v10, v3

    .line 415
    .line 416
    iget v10, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 417
    .line 418
    if-ne v10, v5, :cond_14

    .line 419
    .line 420
    goto :goto_5

    .line 421
    :cond_14
    float-to-int v6, v6

    .line 422
    float-to-int v7, v7

    .line 423
    invoke-virtual {v0, v6, v7}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(II)Landroid/view/View;

    .line 424
    .line 425
    .line 426
    move-result-object v6

    .line 427
    invoke-virtual {v0, v6, v8, v9}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Landroid/view/View;FF)Z

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    if-eqz v7, :cond_15

    .line 432
    .line 433
    invoke-virtual {v0, v6, v3}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-eqz v3, :cond_15

    .line 438
    .line 439
    goto :goto_5

    .line 440
    :cond_15
    add-int/lit8 v4, v4, 0x1

    .line 441
    .line 442
    goto :goto_4

    .line 443
    :cond_16
    :goto_5
    invoke-virtual/range {p0 .. p1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世(Landroid/view/MotionEvent;)V

    .line 444
    .line 445
    .line 446
    return-void

    .line 447
    :cond_17
    iget v1, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 448
    .line 449
    if-ne v1, v5, :cond_18

    .line 450
    .line 451
    invoke-virtual {v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲兰世()V

    .line 452
    .line 453
    .line 454
    :cond_18
    invoke-virtual {v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰()V

    .line 455
    .line 456
    .line 457
    return-void

    .line 458
    :cond_19
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 459
    .line 460
    .line 461
    move-result v2

    .line 462
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 463
    .line 464
    .line 465
    move-result v3

    .line 466
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    float-to-int v4, v2

    .line 471
    float-to-int v5, v3

    .line 472
    invoke-virtual {v0, v4, v5}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世哲兰(II)Landroid/view/View;

    .line 473
    .line 474
    .line 475
    move-result-object v4

    .line 476
    invoke-virtual {v0, v2, v3, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰世哲(FFI)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v0, v4, v1}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;I)Z

    .line 480
    .line 481
    .line 482
    iget-object v0, v0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏世兰哲:[I

    .line 483
    .line 484
    aget v0, v0, v1

    .line 485
    .line 486
    return-void
.end method

.method public final 飘花落叶言子楪苏哲兰世()V
    .locals 6

    .line 1
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    const/16 v1, 0x3e8

    .line 4
    .line 5
    iget v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰:F

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 11
    .line 12
    iget v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget v3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世兰苏:F

    .line 23
    .line 24
    cmpg-float v4, v1, v3

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    if-gez v4, :cond_0

    .line 28
    .line 29
    move v0, v5

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    cmpl-float v1, v1, v2

    .line 32
    .line 33
    if-lez v1, :cond_2

    .line 34
    .line 35
    cmpl-float v0, v0, v5

    .line 36
    .line 37
    if-lez v0, :cond_1

    .line 38
    .line 39
    move v0, v2

    .line 40
    goto :goto_0

    .line 41
    :cond_1
    neg-float v0, v2

    .line 42
    :cond_2
    :goto_0
    iget-object v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏兰哲世:Landroid/view/VelocityTracker;

    .line 43
    .line 44
    iget v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰:I

    .line 45
    .line 46
    invoke-virtual {v1, v4}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    cmpg-float v3, v4, v3

    .line 55
    .line 56
    if-gez v3, :cond_3

    .line 57
    .line 58
    move v2, v5

    .line 59
    goto :goto_1

    .line 60
    :cond_3
    cmpl-float v3, v4, v2

    .line 61
    .line 62
    if-lez v3, :cond_5

    .line 63
    .line 64
    cmpl-float v1, v1, v5

    .line 65
    .line 66
    if-lez v1, :cond_4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    neg-float v2, v2

    .line 70
    goto :goto_1

    .line 71
    :cond_5
    move v2, v1

    .line 72
    :goto_1
    const/4 v1, 0x1

    .line 73
    iput-boolean v1, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 74
    .line 75
    iget-object v3, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;

    .line 76
    .line 77
    iget-object v4, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Landroid/view/View;

    .line 78
    .line 79
    invoke-virtual {v3, v4, v0, v2}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世苏楪兰哲(Landroid/view/View;FF)V

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    iput-boolean v0, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世苏哲:Z

    .line 84
    .line 85
    iget v2, p0, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰:I

    .line 86
    .line 87
    if-ne v2, v1, :cond_6

    .line 88
    .line 89
    invoke-virtual {p0, v0}, L飘花落叶言子哲苏楪兰世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲世苏兰(I)V

    .line 90
    .line 91
    .line 92
    :cond_6
    return-void
.end method
