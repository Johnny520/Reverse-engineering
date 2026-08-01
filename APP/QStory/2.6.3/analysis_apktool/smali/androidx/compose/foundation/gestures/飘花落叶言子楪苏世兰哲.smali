.class public final Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:F

.field public final 飘花落叶言子楪世苏兰哲:J

.field public final 飘花落叶言子楪世苏哲兰:F


# direct methods
.method public constructor <init>(FFJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 5
    .line 6
    iput-wide p3, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 7
    .line 8
    iput p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;

    .line 10
    .line 11
    iget v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 12
    .line 13
    iget v1, p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 14
    .line 15
    invoke-static {v0, v1}, Ljava/lang/Float;->compare(FF)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-wide v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 23
    .line 24
    iget-wide v2, p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 25
    .line 26
    invoke-static {v0, v1, v2, v3}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 34
    .line 35
    iget p1, p1, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 36
    .line 37
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-eqz p0, :cond_4

    .line 42
    .line 43
    :goto_0
    const/4 p0, 0x0

    .line 44
    return p0

    .line 45
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 46
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

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
    iget-wide v2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世兰苏哲(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 17
    .line 18
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

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
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "AnimationData(zoom="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget v1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:F

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", offset="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-wide v1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:J

    .line 19
    .line 20
    invoke-static {v1, v2}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", degrees="

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:F

    .line 33
    .line 34
    const/16 v1, 0x29

    .line 35
    .line 36
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏(Ljava/lang/StringBuilder;FC)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method
