.class public final Lds0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public α:I

.field public β:Landroidx/recyclerview/widget/RecyclerView;

.field public γ:Lzl1;

.field public δ:Z

.field public ε:Z

.field public ζ:Landroid/view/View;

.field public final η:Lim1;

.field public θ:Z

.field public final ι:Landroid/view/animation/LinearInterpolator;

.field public final κ:Landroid/view/animation/DecelerateInterpolator;

.field public λ:Landroid/graphics/PointF;

.field public final μ:Landroid/util/DisplayMetrics;

.field public ν:Z

.field public ξ:F

.field public ο:I

.field public π:I


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
    iput v0, p0, Lds0;->α:I

    .line 6
    .line 7
    new-instance v1, Lim1;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput v0, v1, Lim1;->δ:I

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-boolean v0, v1, Lim1;->ζ:Z

    .line 16
    .line 17
    iput v0, v1, Lim1;->η:I

    .line 18
    .line 19
    iput v0, v1, Lim1;->α:I

    .line 20
    .line 21
    iput v0, v1, Lim1;->β:I

    .line 22
    .line 23
    const/high16 v2, -0x80000000

    .line 24
    .line 25
    iput v2, v1, Lim1;->γ:I

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    iput-object v2, v1, Lim1;->ε:Landroid/view/animation/Interpolator;

    .line 29
    .line 30
    iput-object v1, p0, Lds0;->η:Lim1;

    .line 31
    .line 32
    new-instance v1, Landroid/view/animation/LinearInterpolator;

    .line 33
    .line 34
    invoke-direct {v1}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lds0;->ι:Landroid/view/animation/LinearInterpolator;

    .line 38
    .line 39
    new-instance v1, Landroid/view/animation/DecelerateInterpolator;

    .line 40
    .line 41
    invoke-direct {v1}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object v1, p0, Lds0;->κ:Landroid/view/animation/DecelerateInterpolator;

    .line 45
    .line 46
    iput-boolean v0, p0, Lds0;->ν:Z

    .line 47
    .line 48
    iput v0, p0, Lds0;->ο:I

    .line 49
    .line 50
    iput v0, p0, Lds0;->π:I

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
    iput-object p1, p0, Lds0;->μ:Landroid/util/DisplayMetrics;

    .line 61
    .line 62
    return-void
.end method

.method public static α(IIIII)I
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
    invoke-static {p0}, Lγ;->ν(Ljava/lang/String;)V

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
.method public final β(I)I
    .locals 2

    .line 1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-float p1, p1

    .line 6
    iget-boolean v0, p0, Lds0;->ν:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lds0;->μ:Landroid/util/DisplayMetrics;

    .line 11
    .line 12
    iget v0, v0, Landroid/util/DisplayMetrics;->densityDpi:I

    .line 13
    .line 14
    int-to-float v0, v0

    .line 15
    const/high16 v1, 0x41c80000    # 25.0f

    .line 16
    .line 17
    div-float/2addr v1, v0

    .line 18
    iput v1, p0, Lds0;->ξ:F

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lds0;->ν:Z

    .line 22
    .line 23
    :cond_0
    iget p0, p0, Lds0;->ξ:F

    .line 24
    .line 25
    mul-float/2addr p1, p0

    .line 26
    float-to-double p0, p1

    .line 27
    invoke-static {p0, p1}, Ljava/lang/Math;->ceil(D)D

    .line 28
    .line 29
    .line 30
    move-result-wide p0

    .line 31
    double-to-int p0, p0

    .line 32
    return p0
.end method

.method public final γ(I)Landroid/graphics/PointF;
    .locals 1

    .line 1
    iget-object p0, p0, Lds0;->γ:Lzl1;

    .line 2
    .line 3
    instance-of v0, p0, Ljm1;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    check-cast p0, Ljm1;

    .line 8
    .line 9
    invoke-interface {p0, p1}, Ljm1;->α(I)Landroid/graphics/PointF;

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
    const-class p1, Ljm1;

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

.method public final δ()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lds0;->ε:Z

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
    iput-boolean v0, p0, Lds0;->ε:Z

    .line 8
    .line 9
    iput v0, p0, Lds0;->π:I

    .line 10
    .line 11
    iput v0, p0, Lds0;->ο:I

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    iput-object v1, p0, Lds0;->λ:Landroid/graphics/PointF;

    .line 15
    .line 16
    iget-object v2, p0, Lds0;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->д:Lkm1;

    .line 19
    .line 20
    const/4 v3, -0x1

    .line 21
    iput v3, v2, Lkm1;->α:I

    .line 22
    .line 23
    iput-object v1, p0, Lds0;->ζ:Landroid/view/View;

    .line 24
    .line 25
    iput v3, p0, Lds0;->α:I

    .line 26
    .line 27
    iput-boolean v0, p0, Lds0;->δ:Z

    .line 28
    .line 29
    iget-object v0, p0, Lds0;->γ:Lzl1;

    .line 30
    .line 31
    iget-object v2, v0, Lzl1;->ε:Lds0;

    .line 32
    .line 33
    if-ne v2, p0, :cond_1

    .line 34
    .line 35
    iput-object v1, v0, Lzl1;->ε:Lds0;

    .line 36
    .line 37
    :cond_1
    iput-object v1, p0, Lds0;->γ:Lzl1;

    .line 38
    .line 39
    iput-object v1, p0, Lds0;->β:Landroidx/recyclerview/widget/RecyclerView;

    .line 40
    .line 41
    return-void
.end method
