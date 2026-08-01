.class public final Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Landroidx/collection/飘花落叶言子楪苏兰世哲;

.field public 飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

.field public 飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

.field public 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

.field public 飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

.field public 飘花落叶言子楪苏世哲兰:Landroidx/collection/飘花落叶言子楪苏兰世哲;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 13
    .line 14
    iget-object p1, p1, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 15
    .line 16
    if-eq p0, p1, :cond_2

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_2
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    const/16 v0, 0x1f

    .line 8
    .line 9
    mul-int/2addr p0, v0

    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(III)I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    add-int/2addr v0, p0

    .line 20
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "FlowLayoutOverflowState(type="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string p0, ", minLinesToShowCollapse=0, minCrossAxisSizeToShowCollapse=0)"

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;J)V
    .locals 4

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/LayoutOrientation;->Horizontal:Landroidx/compose/foundation/layout/LayoutOrientation;

    .line 2
    .line 3
    invoke-static {p3, p4, v0}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世兰苏哲(JLandroidx/compose/foundation/layout/LayoutOrientation;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p3

    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_1

    .line 9
    .line 10
    invoke-static {p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-interface {p1, v1}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子世哲兰苏楪(I)I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-static {v1, v2}, Landroidx/collection/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(II)J

    .line 23
    .line 24
    .line 25
    move-result-wide v1

    .line 26
    new-instance v3, Landroidx/collection/飘花落叶言子楪苏兰世哲;

    .line 27
    .line 28
    invoke-direct {v3, v1, v2}, Landroidx/collection/飘花落叶言子楪苏兰世哲;-><init>(J)V

    .line 29
    .line 30
    .line 31
    iput-object v3, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:Landroidx/collection/飘花落叶言子楪苏兰世哲;

    .line 32
    .line 33
    instance-of v1, p1, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 34
    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    check-cast p1, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object p1, v0

    .line 41
    :goto_0
    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 42
    .line 43
    iput-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 44
    .line 45
    :cond_1
    if-eqz p2, :cond_3

    .line 46
    .line 47
    invoke-static {p3, p4}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)I

    .line 48
    .line 49
    .line 50
    move-result p1

    .line 51
    invoke-interface {p2, p1}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏兰哲世(I)I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    invoke-interface {p2, p1}, Landroidx/compose/ui/layout/飘花落叶言子楪哲兰世苏;->飘花落叶言子世哲兰苏楪(I)I

    .line 56
    .line 57
    .line 58
    move-result p3

    .line 59
    invoke-static {p1, p3}, Landroidx/collection/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(II)J

    .line 60
    .line 61
    .line 62
    move-result-wide p3

    .line 63
    new-instance p1, Landroidx/collection/飘花落叶言子楪苏兰世哲;

    .line 64
    .line 65
    invoke-direct {p1, p3, p4}, Landroidx/collection/飘花落叶言子楪苏兰世哲;-><init>(J)V

    .line 66
    .line 67
    .line 68
    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰:Landroidx/collection/飘花落叶言子楪苏兰世哲;

    .line 69
    .line 70
    instance-of p1, p2, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 71
    .line 72
    if-eqz p1, :cond_2

    .line 73
    .line 74
    check-cast p2, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_2
    move-object p2, v0

    .line 78
    :goto_1
    iput-object p2, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;

    .line 79
    .line 80
    iput-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 81
    .line 82
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(IIZ)Landroidx/collection/飘花落叶言子楪苏兰世哲;
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰:[I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    aget v0, v0, v1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq v0, v1, :cond_3

    .line 13
    .line 14
    const/4 v2, 0x2

    .line 15
    if-eq v0, v2, :cond_3

    .line 16
    .line 17
    const/4 v2, 0x3

    .line 18
    if-eq v0, v2, :cond_2

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:Landroidx/collection/飘花落叶言子楪苏兰世哲;

    .line 26
    .line 27
    return-object p0

    .line 28
    :cond_0
    add-int/2addr p1, v1

    .line 29
    if-ltz p1, :cond_3

    .line 30
    .line 31
    if-ltz p2, :cond_3

    .line 32
    .line 33
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪苏世哲兰:Landroidx/collection/飘花落叶言子楪苏兰世哲;

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    return-object p0

    .line 41
    :cond_2
    if-eqz p3, :cond_3

    .line 42
    .line 43
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世兰哲苏:Landroidx/collection/飘花落叶言子楪苏兰世哲;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_3
    const/4 p0, 0x0

    .line 47
    return-object p0
.end method
