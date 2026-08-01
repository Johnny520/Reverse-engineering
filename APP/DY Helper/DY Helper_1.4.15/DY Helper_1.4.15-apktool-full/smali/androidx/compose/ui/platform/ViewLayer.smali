.class public final Landroidx/compose/ui/platform/ViewLayer;
.super Landroid/view/View;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lw81;


# static fields
.field public static η:Ljava/lang/reflect/Method;

.field public static θ:Ljava/lang/reflect/Field;

.field public static ι:Z

.field public static κ:Z


# instance fields
.field public ε:Z

.field public ζ:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll92;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Ll92;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method private final getManualClipPath()Lz91;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    throw v0
.end method

.method private final setInvalidated(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->ε:Z

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iput-boolean p1, p0, Landroidx/compose/ui/platform/ViewLayer;->ε:Z

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    throw p0
.end method


# virtual methods
.method public final destroy()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->setInvalidated(Z)V

    .line 3
    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    throw p0
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final forceLayout()V
    .locals 0

    .line 1
    return-void
.end method

.method public final getCameraDistancePx()F
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getCameraDistance()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget p0, p0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 14
    .line 15
    int-to-float p0, p0

    .line 16
    div-float/2addr v0, p0

    .line 17
    return v0
.end method

.method public final getContainer()Landroidx/compose/ui/platform/DrawChildContainer;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getFrameRate()F
    .locals 0

    .line 1
    iget p0, p0, Landroidx/compose/ui/platform/ViewLayer;->ζ:F

    .line 2
    .line 3
    return p0
.end method

.method public getLayerId()J
    .locals 2

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getOwnerView()Landroidx/compose/ui/platform/AndroidComposeView;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getOwnerViewId()J
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public getUnderlyingMatrix-sQKQjiQ()[F
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final hasOverlappingRendering()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final invalidate()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Landroidx/compose/ui/platform/ViewLayer;->setInvalidated(Z)V

    .line 8
    .line 9
    .line 10
    invoke-super {p0}, Landroid/view/View;->invalidate()V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setCameraDistancePx(F)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 10
    .line 11
    int-to-float v0, v0

    .line 12
    mul-float/2addr p1, v0

    .line 13
    invoke-virtual {p0, p1}, Landroid/view/View;->setCameraDistance(F)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public setFrameRate(F)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/platform/ViewLayer;->ζ:F

    .line 2
    .line 3
    return-void
.end method

.method public setFrameRateFromParent(Z)V
    .locals 0

    .line 1
    return-void
.end method

.method public final α(Lio1;)V
    .locals 0

    .line 1
    iget p0, p1, Lio1;->ε:I

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    throw p0
.end method

.method public final β(JZ)J
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p3, :cond_0

    .line 3
    .line 4
    throw p0

    .line 5
    :cond_0
    throw p0
.end method

.method public final γ(J)V
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    const-wide v1, 0xffffffffL

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    and-long/2addr p1, v1

    .line 12
    long-to-int p1, p1

    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-ne v0, p2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-ne p1, p2, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    sget p2, Lr52;->β:I

    .line 27
    .line 28
    const-wide/16 v1, 0x0

    .line 29
    .line 30
    long-to-int p2, v1

    .line 31
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    int-to-float v0, v0

    .line 36
    mul-float/2addr p2, v0

    .line 37
    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotX(F)V

    .line 38
    .line 39
    .line 40
    long-to-int p2, v1

    .line 41
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    int-to-float p1, p1

    .line 46
    mul-float/2addr p2, p1

    .line 47
    invoke-virtual {p0, p2}, Landroid/view/View;->setPivotY(F)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0
.end method

.method public final δ(La21;Z)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    throw p0

    .line 5
    :cond_0
    throw p0
.end method

.method public final ε(Le80;Lp70;)V
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public final ζ(Lde;Lwa0;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getElevation()F

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, 0x0

    .line 6
    cmpl-float p2, p2, v0

    .line 7
    .line 8
    if-lez p2, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Lde;->μ()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getDrawingTime()J

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public final η(J)V
    .locals 3

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    if-ne v0, v1, :cond_1

    .line 12
    .line 13
    const-wide v0, 0xffffffffL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    and-long/2addr p1, v0

    .line 19
    long-to-int p1, p1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-ne p1, p2, :cond_0

    .line 25
    .line 26
    return-void

    .line 27
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getTop()I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    sub-int/2addr p1, p2

    .line 32
    invoke-virtual {p0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 33
    .line 34
    .line 35
    throw v2

    .line 36
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getLeft()I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    sub-int/2addr v0, p1

    .line 41
    invoke-virtual {p0, v0}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 42
    .line 43
    .line 44
    throw v2
.end method

.method public final θ()V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/ViewLayer;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    sget-boolean v0, Landroidx/compose/ui/platform/ViewLayer;->κ:Z

    .line 6
    .line 7
    if-nez v0, :cond_4

    .line 8
    .line 9
    const-class v0, Landroid/view/View;

    .line 10
    .line 11
    const-class v1, Ljava/lang/String;

    .line 12
    .line 13
    const-class v2, Ljava/lang/Class;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x1

    .line 17
    :try_start_0
    sget-boolean v5, Landroidx/compose/ui/platform/ViewLayer;->ι:Z

    .line 18
    .line 19
    if-nez v5, :cond_1

    .line 20
    .line 21
    sput-boolean v4, Landroidx/compose/ui/platform/ViewLayer;->ι:Z

    .line 22
    .line 23
    const-string v5, "getDeclaredMethod"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    new-array v7, v6, [Ljava/lang/Class;

    .line 27
    .line 28
    aput-object v1, v7, v3

    .line 29
    .line 30
    new-array v8, v3, [Ljava/lang/Class;

    .line 31
    .line 32
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v8

    .line 36
    aput-object v8, v7, v4

    .line 37
    .line 38
    invoke-virtual {v2, v5, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    new-array v6, v6, [Ljava/lang/Object;

    .line 43
    .line 44
    const-string v7, "updateDisplayListIfDirty"

    .line 45
    .line 46
    aput-object v7, v6, v3

    .line 47
    .line 48
    new-array v7, v3, [Ljava/lang/Class;

    .line 49
    .line 50
    aput-object v7, v6, v4

    .line 51
    .line 52
    invoke-virtual {v5, v0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    check-cast v5, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    sput-object v5, Landroidx/compose/ui/platform/ViewLayer;->η:Ljava/lang/reflect/Method;

    .line 59
    .line 60
    const-string v5, "getDeclaredField"

    .line 61
    .line 62
    new-array v6, v4, [Ljava/lang/Class;

    .line 63
    .line 64
    aput-object v1, v6, v3

    .line 65
    .line 66
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    new-array v2, v4, [Ljava/lang/Object;

    .line 71
    .line 72
    const-string v5, "mRecreateDisplayList"

    .line 73
    .line 74
    aput-object v5, v2, v3

    .line 75
    .line 76
    invoke-virtual {v1, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/reflect/Field;

    .line 81
    .line 82
    sput-object v0, Landroidx/compose/ui/platform/ViewLayer;->θ:Ljava/lang/reflect/Field;

    .line 83
    .line 84
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->η:Ljava/lang/reflect/Method;

    .line 85
    .line 86
    if-eqz v0, :cond_0

    .line 87
    .line 88
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 89
    .line 90
    .line 91
    :cond_0
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->θ:Ljava/lang/reflect/Field;

    .line 92
    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 96
    .line 97
    .line 98
    :cond_1
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->θ:Ljava/lang/reflect/Field;

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    invoke-virtual {v0, p0, v4}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 103
    .line 104
    .line 105
    :cond_2
    sget-object v0, Landroidx/compose/ui/platform/ViewLayer;->η:Ljava/lang/reflect/Method;

    .line 106
    .line 107
    if-eqz v0, :cond_3

    .line 108
    .line 109
    const/4 v1, 0x0

    .line 110
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    :catchall_0
    sput-boolean v4, Landroidx/compose/ui/platform/ViewLayer;->κ:Z

    .line 115
    .line 116
    :cond_3
    :goto_0
    invoke-direct {p0, v3}, Landroidx/compose/ui/platform/ViewLayer;->setInvalidated(Z)V

    .line 117
    .line 118
    .line 119
    :cond_4
    return-void
.end method

.method public final ι(J)Z
    .locals 2

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v0, p1, v0

    .line 4
    .line 5
    long-to-int v0, v0

    .line 6
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    const-wide v0, 0xffffffffL

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    and-long/2addr p1, v0

    .line 15
    long-to-int p1, p1

    .line 16
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getClipToOutline()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-nez p0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x1

    .line 26
    return p0

    .line 27
    :cond_0
    const/4 p0, 0x0

    .line 28
    throw p0
.end method
