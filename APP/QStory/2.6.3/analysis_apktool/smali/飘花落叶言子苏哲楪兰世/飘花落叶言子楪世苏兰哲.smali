.class public final L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言子苏哲楪兰世/飘花落叶言子楪哲世兰苏;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:F

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 5
    .line 6
    iput p2, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;

    .line 12
    .line 13
    iget-object v1, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 14
    .line 15
    iget-object v3, p1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 25
    .line 26
    iget p1, p1, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 27
    .line 28
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

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
    const-string v1, "BrushStyle(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", alpha="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/StringBuilder;FC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Landroidx/compose/ui/graphics/飘花落叶言子楪兰世苏哲;
    .locals 0

    .line 1
    iget-object p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲()J
    .locals 2

    .line 1
    sget p0, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏哲世兰:I

    .line 2
    .line 3
    sget-wide v0, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪苏世兰哲:J

    .line 4
    .line 5
    return-wide v0
.end method

.method public final 飘花落叶言子楪世苏哲兰()F
    .locals 0

    .line 1
    iget p0, p0, L飘花落叶言子苏哲楪兰世/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:F

    .line 2
    .line 3
    return p0
.end method
