.class public final Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/text/input/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:I

.field public final 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public constructor <init>(II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:I

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:I

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
    instance-of v1, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

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
    check-cast p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;

    .line 12
    .line 13
    iget v1, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:I

    .line 14
    .line 15
    iget v3, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    if-eq v3, v1, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:I

    .line 21
    .line 22
    iget p1, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:I

    .line 23
    .line 24
    if-eq p0, p1, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    return v0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:I

    .line 6
    .line 7
    add-int/2addr v0, p0

    .line 8
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "SetSelectionCommand(start="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:I

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", end="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:I

    .line 19
    .line 20
    const/16 v1, 0x29

    .line 21
    .line 22
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/text/input/飘花落叶言子楪苏世兰哲;)V
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:I

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v1, v2, v0}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v1, p1, Landroidx/compose/ui/text/input/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪兰苏世哲:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;

    .line 19
    .line 20
    invoke-virtual {v1}, Landroidx/compose/ui/text/input/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏兰哲()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    iget p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲:I

    .line 25
    .line 26
    invoke-static {p0, v2, v1}, Landroidx/window/area/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰(III)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-ge v0, p0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p1, v0, p0}, Landroidx/compose/ui/text/input/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(II)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :cond_0
    invoke-virtual {p1, p0, v0}, Landroidx/compose/ui/text/input/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(II)V

    .line 37
    .line 38
    .line 39
    return-void
.end method
