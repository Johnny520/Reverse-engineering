.class public abstract Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;

.field public static final 飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;


# instance fields
.field public 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;

    .line 8
    .line 9
    new-instance v0, Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-direct {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;

    .line 16
    .line 17
    return-void
.end method

.method public static 飘花落叶言子楪世兰苏哲(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;FFZ)V
    .locals 6

    .line 1
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 2
    .line 3
    if-eqz p4, :cond_3

    .line 4
    .line 5
    const p4, 0x240901aa

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, p4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-nez v0, :cond_3

    .line 13
    .line 14
    sget-object v0, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getElevation()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    const/4 v3, 0x0

    .line 30
    :goto_0
    if-ge v3, v1, :cond_2

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    if-ne v4, p1, :cond_0

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_0
    sget-object v5, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    invoke-virtual {v4}, Landroid/view/View;->getElevation()F

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    cmpl-float v5, v4, v2

    .line 46
    .line 47
    if-lez v5, :cond_1

    .line 48
    .line 49
    move v2, v4

    .line 50
    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    const/high16 p0, 0x3f800000    # 1.0f

    .line 54
    .line 55
    add-float/2addr v2, p0

    .line 56
    invoke-virtual {p1, v2}, Landroid/view/View;->setElevation(F)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1, p4, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    :cond_3
    invoke-virtual {p1, p2}, Landroid/view/View;->setTranslationX(F)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, p3}, Landroid/view/View;->setTranslationY(F)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method public static 飘花落叶言子楪世哲苏兰(II)I
    .locals 3

    .line 1
    const v0, 0xc0c0c

    .line 2
    .line 3
    .line 4
    and-int v1, p0, v0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    not-int v2, v1

    .line 10
    and-int/2addr p0, v2

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    shl-int/lit8 p1, v1, 0x2

    .line 14
    .line 15
    :goto_0
    or-int/2addr p0, p1

    .line 16
    return p0

    .line 17
    :cond_1
    shl-int/lit8 p1, v1, 0x1

    .line 18
    .line 19
    const v1, -0xc0c0d

    .line 20
    .line 21
    .line 22
    and-int/2addr v1, p1

    .line 23
    or-int/2addr p0, v1

    .line 24
    and-int/2addr p1, v0

    .line 25
    shl-int/lit8 p1, p1, 0x2

    .line 26
    .line 27
    goto :goto_0
.end method

.method public static 飘花落叶言子楪世苏兰哲(II)I
    .locals 3

    .line 1
    const v0, 0x303030

    .line 2
    .line 3
    .line 4
    and-int v1, p0, v0

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    return p0

    .line 9
    :cond_0
    not-int v2, v1

    .line 10
    and-int/2addr p0, v2

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    shr-int/lit8 p1, v1, 0x2

    .line 14
    .line 15
    :goto_0
    or-int/2addr p0, p1

    .line 16
    return p0

    .line 17
    :cond_1
    shr-int/lit8 p1, v1, 0x1

    .line 18
    .line 19
    const v1, -0x303031

    .line 20
    .line 21
    .line 22
    and-int/2addr v1, p1

    .line 23
    or-int/2addr p0, v1

    .line 24
    and-int/2addr p1, v0

    .line 25
    shr-int/lit8 p1, p1, 0x2

    .line 26
    .line 27
    goto :goto_0
.end method

.method public static 飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;)V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 2
    .line 3
    const v0, 0x240901aa

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    instance-of v2, v1, Ljava/lang/Float;

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Float;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sget-object v2, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/WeakHashMap;

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Landroid/view/View;->setElevation(F)V

    .line 23
    .line 24
    .line 25
    :cond_0
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 v0, 0x0

    .line 30
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Ltop/suzhelan/qstory/ui/views/DialogXRecycleView;IIJ)I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    const v0, 0x2407009f

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    iput p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 18
    .line 19
    :cond_0
    iget p0, p0, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:I

    .line 20
    .line 21
    invoke-static {p3}, Ljava/lang/Math;->abs(I)I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    int-to-float v0, p3

    .line 26
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    float-to-int v0, v0

    .line 31
    int-to-float p1, p1

    .line 32
    const/high16 v2, 0x3f800000    # 1.0f

    .line 33
    .line 34
    mul-float/2addr p1, v2

    .line 35
    int-to-float p2, p2

    .line 36
    div-float/2addr p1, p2

    .line 37
    invoke-static {v2, p1}, Ljava/lang/Math;->min(FF)F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    mul-int/2addr v0, p0

    .line 42
    int-to-float p0, v0

    .line 43
    sget-object p2, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世哲苏兰:Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;

    .line 44
    .line 45
    invoke-virtual {p2, p1}, Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;->getInterpolation(F)F

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    mul-float/2addr p1, p0

    .line 50
    float-to-int p0, p1

    .line 51
    const-wide/16 p1, 0x7d0

    .line 52
    .line 53
    cmp-long p1, p4, p1

    .line 54
    .line 55
    if-lez p1, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    long-to-float p1, p4

    .line 59
    const/high16 p2, 0x44fa0000    # 2000.0f

    .line 60
    .line 61
    div-float v2, p1, p2

    .line 62
    .line 63
    :goto_0
    int-to-float p0, p0

    .line 64
    sget-object p1, Landroidx/recyclerview/widget/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;

    .line 65
    .line 66
    invoke-virtual {p1, v2}, Landroidx/recyclerview/widget/飘花落叶言子世楪哲苏兰;->getInterpolation(F)F

    .line 67
    .line 68
    .line 69
    move-result p1

    .line 70
    mul-float/2addr p1, p0

    .line 71
    float-to-int p0, p1

    .line 72
    if-nez p0, :cond_3

    .line 73
    .line 74
    if-lez p3, :cond_2

    .line 75
    .line 76
    const/4 p0, 0x1

    .line 77
    return p0

    .line 78
    :cond_2
    return v1

    .line 79
    :cond_3
    return p0
.end method
