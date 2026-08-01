.class public final Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;
.super Landroid/view/View;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪兰苏世哲:[I

.field public static final 飘花落叶言子楪兰苏哲世:[I


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

.field public 飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

.field public 飘花落叶言子楪哲兰世苏:Ljava/lang/Boolean;

.field public 飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

.field public 飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const v0, 0x10100a7

    .line 2
    .line 3
    .line 4
    const v1, 0x101009e

    .line 5
    .line 6
    .line 7
    filled-new-array {v0, v1}, [I

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:[I

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    sput-object v0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏哲世:[I

    .line 17
    .line 18
    return-void
.end method

.method private final setRippleState(Z)V
    .locals 6

    .line 1
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object v2, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->run()V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v2, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    const-wide/16 v2, 0x0

    .line 25
    .line 26
    :goto_0
    sub-long v2, v0, v2

    .line 27
    .line 28
    if-nez p1, :cond_2

    .line 29
    .line 30
    const-wide/16 v4, 0x5

    .line 31
    .line 32
    cmp-long v2, v2, v4

    .line 33
    .line 34
    if-gez v2, :cond_2

    .line 35
    .line 36
    new-instance p1, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-direct {p1, p0, v2}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;-><init>(Ljava/lang/Object;I)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 43
    .line 44
    const-wide/16 v2, 0x32

    .line 45
    .line 46
    invoke-virtual {p0, p1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    if-eqz p1, :cond_3

    .line 51
    .line 52
    sget-object p1, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏世哲:[I

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    sget-object p1, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏哲世:[I

    .line 56
    .line 57
    :goto_1
    iget-object v2, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 58
    .line 59
    if-eqz v2, :cond_4

    .line 60
    .line 61
    invoke-virtual {v2, p1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 62
    .line 63
    .line 64
    :cond_4
    :goto_2
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Long;

    .line 69
    .line 70
    return-void
.end method

.method private static final setRippleState$lambda$1(Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏哲世:[I

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic 飘花落叶言子楪世苏哲兰(Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->setRippleState$lambda$1(Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onMeasure(II)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1, p1}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final refreshDrawableState()V
    .locals 0

    .line 1
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(JJI)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/RippleDrawable;->getRadius()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eq v1, p5, :cond_1

    .line 11
    .line 12
    invoke-virtual {v0, p5}, Landroid/graphics/drawable/RippleDrawable;->setRadius(I)V

    .line 13
    .line 14
    .line 15
    :cond_1
    sget p5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x1c

    .line 18
    .line 19
    if-ge p5, v1, :cond_2

    .line 20
    .line 21
    const p5, 0x3e4ccccd    # 0.2f

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_2
    const p5, 0x3dcccccd    # 0.1f

    .line 26
    .line 27
    .line 28
    :goto_0
    const/high16 v1, 0x3f800000    # 1.0f

    .line 29
    .line 30
    cmpl-float v2, p5, v1

    .line 31
    .line 32
    if-lez v2, :cond_3

    .line 33
    .line 34
    move p5, v1

    .line 35
    :cond_3
    invoke-static {p5, p3, p4}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏兰哲(FJ)J

    .line 36
    .line 37
    .line 38
    move-result-wide p3

    .line 39
    iget-object p5, v0, Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    if-nez p5, :cond_4

    .line 43
    .line 44
    move p5, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_4
    iget-wide v2, p5, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世苏哲兰:J

    .line 47
    .line 48
    invoke-static {v2, v3, p3, p4}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 49
    .line 50
    .line 51
    move-result p5

    .line 52
    :goto_1
    if-nez p5, :cond_5

    .line 53
    .line 54
    new-instance p5, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;

    .line 55
    .line 56
    invoke-direct {p5, p3, p4}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;-><init>(J)V

    .line 57
    .line 58
    .line 59
    iput-object p5, v0, Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;

    .line 60
    .line 61
    invoke-static {p3, p4}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪哲苏兰(J)I

    .line 62
    .line 63
    .line 64
    move-result p3

    .line 65
    invoke-static {p3}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    invoke-virtual {v0, p3}, Landroid/graphics/drawable/RippleDrawable;->setColor(Landroid/content/res/ColorStateList;)V

    .line 70
    .line 71
    .line 72
    :cond_5
    new-instance p3, Landroid/graphics/Rect;

    .line 73
    .line 74
    const/16 p4, 0x20

    .line 75
    .line 76
    shr-long p4, p1, p4

    .line 77
    .line 78
    long-to-int p4, p4

    .line 79
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 80
    .line 81
    .line 82
    move-result p4

    .line 83
    invoke-static {p4}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(F)I

    .line 84
    .line 85
    .line 86
    move-result p4

    .line 87
    const-wide v2, 0xffffffffL

    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    and-long/2addr p1, v2

    .line 93
    long-to-int p1, p1

    .line 94
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 95
    .line 96
    .line 97
    move-result p1

    .line 98
    invoke-static {p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(F)I

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    invoke-direct {p3, v1, v1, p4, p1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 103
    .line 104
    .line 105
    iget p1, p3, Landroid/graphics/Rect;->left:I

    .line 106
    .line 107
    invoke-virtual {p0, p1}, Landroid/view/View;->setLeft(I)V

    .line 108
    .line 109
    .line 110
    iget p1, p3, Landroid/graphics/Rect;->top:I

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Landroid/view/View;->setTop(I)V

    .line 113
    .line 114
    .line 115
    iget p1, p3, Landroid/graphics/Rect;->right:I

    .line 116
    .line 117
    invoke-virtual {p0, p1}, Landroid/view/View;->setRight(I)V

    .line 118
    .line 119
    .line 120
    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Landroid/view/View;->setBottom(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p3}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->setRippleState(Z)V

    .line 3
    .line 4
    .line 5
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 3
    .line 4
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世苏哲:Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏世兰哲;->run()V

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    sget-object v1, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰苏哲世:[I

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 30
    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    return-void

    .line 34
    :cond_2
    const/4 v1, 0x0

    .line 35
    invoke-virtual {v0, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/view/View;->unscheduleDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;ZJIJLandroidx/compose/foundation/飘花落叶言子世楪哲苏兰;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Boolean;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    :cond_0
    new-instance v0, Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 18
    .line 19
    invoke-direct {v0, p2}, Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;-><init>(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 26
    .line 27
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Boolean;

    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/material/ripple/飘花落叶言子楪哲苏世兰;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iput-object p8, p0, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/foundation/飘花落叶言子世楪哲苏兰;

    .line 39
    .line 40
    move p8, p5

    .line 41
    move-wide p4, p3

    .line 42
    move-object p3, p0

    .line 43
    invoke-virtual/range {p3 .. p8}, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲(JJI)V

    .line 44
    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    iget-wide p4, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:J

    .line 49
    .line 50
    const/16 p0, 0x20

    .line 51
    .line 52
    shr-long/2addr p4, p0

    .line 53
    long-to-int p0, p4

    .line 54
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    iget-wide p1, p1, Landroidx/compose/foundation/interaction/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世苏哲兰:J

    .line 59
    .line 60
    const-wide p4, 0xffffffffL

    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    and-long/2addr p1, p4

    .line 66
    long-to-int p1, p1

    .line 67
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {p0}, Landroid/graphics/Rect;->centerX()I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    int-to-float p0, p0

    .line 84
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Landroid/graphics/Rect;->centerY()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    int-to-float p1, p1

    .line 93
    invoke-virtual {v0, p0, p1}, Landroid/graphics/drawable/Drawable;->setHotspot(FF)V

    .line 94
    .line 95
    .line 96
    :goto_0
    const/4 p0, 0x1

    .line 97
    invoke-direct {p3, p0}, Landroidx/compose/material/ripple/飘花落叶言子楪苏哲世兰;->setRippleState(Z)V

    .line 98
    .line 99
    .line 100
    return-void
.end method
