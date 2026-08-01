.class public final Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲兰苏:I

.field public final 飘花落叶言子楪世哲苏兰:F

.field public final 飘花落叶言子楪世苏兰哲:F

.field public 飘花落叶言子楪世苏哲兰:Landroid/graphics/RenderEffect;


# direct methods
.method public constructor <init>(FFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:F

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:F

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;

    .line 10
    .line 11
    iget v0, p1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:F

    .line 12
    .line 13
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:F

    .line 14
    .line 15
    cmpg-float v0, v1, v0

    .line 16
    .line 17
    if-nez v0, :cond_2

    .line 18
    .line 19
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:F

    .line 20
    .line 21
    iget v1, p1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:F

    .line 22
    .line 23
    cmpg-float v0, v0, v1

    .line 24
    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    iget p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 28
    .line 29
    iget p1, p1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 30
    .line 31
    if-ne p0, p1, :cond_2

    .line 32
    .line 33
    :goto_0
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 36
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:F

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:F

    .line 11
    .line 12
    invoke-static {v0, v2, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(IFI)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    add-int/2addr p0, v0

    .line 23
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BlurEffect(renderEffect=null, radiusX="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", radiusY="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:F

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", edgeTreatment="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 29
    .line 30
    invoke-static {p0}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世苏楪兰哲(I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const/16 p0, 0x29

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Landroid/graphics/RenderEffect;
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/RenderEffect;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲:F

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    cmpg-float v2, v0, v1

    .line 9
    .line 10
    iget v3, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲苏兰:F

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    cmpg-float v1, v3, v1

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-static {}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲苏兰()Landroid/graphics/RenderEffect;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget v1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世哲兰苏:I

    .line 24
    .line 25
    invoke-static {v1}, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子世楪苏兰哲(I)Landroid/graphics/Shader$TileMode;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-static {v0, v3, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(FFLandroid/graphics/Shader$TileMode;)Landroid/graphics/RenderEffect;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    iput-object v0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroid/graphics/RenderEffect;

    .line 34
    .line 35
    :cond_1
    return-object v0
.end method
