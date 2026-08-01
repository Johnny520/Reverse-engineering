.class public abstract L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

.field public static final 飘花落叶言子楪世哲苏兰:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

.field public static final 飘花落叶言子楪世苏兰哲:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

.field public static final 飘花落叶言子楪世苏哲兰:Landroid/view/animation/LinearInterpolator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroid/view/animation/LinearInterpolator;

    .line 7
    .line 8
    new-instance v0, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 12
    .line 13
    .line 14
    sput-object v0, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    new-instance v0, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-direct {v0, v1}, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;-><init>(I)V

    .line 20
    .line 21
    .line 22
    sput-object v0, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 23
    .line 24
    new-instance v0, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    sget-object v1, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:[F

    .line 27
    .line 28
    invoke-direct {v0, v1}, L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;-><init>([F)V

    .line 29
    .line 30
    .line 31
    sput-object v0, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子哲兰世苏楪/飘花落叶言子楪世苏哲兰;

    .line 32
    .line 33
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 34
    .line 35
    invoke-direct {v0}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(IFI)I
    .locals 0

    .line 1
    sub-int/2addr p2, p0

    .line 2
    int-to-float p2, p2

    .line 3
    mul-float/2addr p1, p2

    .line 4
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    add-int/2addr p1, p0

    .line 9
    return p1
.end method

.method public static 飘花落叶言子楪世苏兰哲(FFFFF)F
    .locals 1

    .line 1
    cmpg-float v0, p4, p2

    .line 2
    .line 3
    if-gtz v0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    cmpl-float v0, p4, p3

    .line 7
    .line 8
    if-ltz v0, :cond_1

    .line 9
    .line 10
    return p1

    .line 11
    :cond_1
    sub-float/2addr p4, p2

    .line 12
    sub-float/2addr p3, p2

    .line 13
    div-float/2addr p4, p3

    .line 14
    invoke-static {p0, p1, p4}, L飘花落叶言楪苏子哲世兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(FFF)F

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    return p0
.end method

.method public static 飘花落叶言子楪世苏哲兰(FFF)F
    .locals 0

    .line 1
    invoke-static {p1, p0, p2, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰(FFFF)F

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method
