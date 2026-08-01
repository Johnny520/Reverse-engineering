.class public final Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;
.super Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世苏兰哲:F

.field public 飘花落叶言子楪世苏哲兰:F


# direct methods
.method public constructor <init>(FF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 6
    .line 7
    iget v0, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 8
    .line 9
    iget v1, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 10
    .line 11
    cmpg-float v0, v0, v1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iget p1, p1, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 16
    .line 17
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 18
    .line 19
    cmpg-float p0, p1, p0

    .line 20
    .line 21
    if-nez p0, :cond_0

    .line 22
    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    add-int/2addr p0, v0

    .line 16
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AnimationVector2D: v1 = "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", v2 = "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method

.method public final 飘花落叶言子楪世兰苏哲(FI)V
    .locals 1

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p2, v0, :cond_0

    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    iput p1, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 8
    .line 9
    return-void

    .line 10
    :cond_1
    iput p1, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 11
    .line 12
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 3
    .line 4
    iput v0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰()Landroidx/compose/animation/core/飘花落叶言子楪哲苏世兰;
    .locals 1

    .line 1
    new-instance p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    invoke-direct {p0, v0, v0}, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;-><init>(FF)V

    .line 5
    .line 6
    .line 7
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(I)F
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p1, v0, :cond_0

    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏兰哲:F

    .line 9
    .line 10
    return p0

    .line 11
    :cond_1
    iget p0, p0, Landroidx/compose/animation/core/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪世苏哲兰:F

    .line 12
    .line 13
    return p0
.end method
