.class public final synthetic Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Z

.field public final synthetic 飘花落叶言子楪哲苏兰世:J


# direct methods
.method public synthetic constructor <init>(JL飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:J

    .line 5
    .line 6
    iput-object p3, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    iput-boolean p4, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    check-cast p1, Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    iget-object v0, p1, Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/draw/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    invoke-interface {v0}, Landroidx/compose/ui/draw/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲兰世()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const/16 v2, 0x20

    .line 10
    .line 11
    shr-long/2addr v0, v2

    .line 12
    long-to-int v0, v0

    .line 13
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/high16 v1, 0x40000000    # 2.0f

    .line 18
    .line 19
    div-float/2addr v0, v1

    .line 20
    invoke-static {p1, v0}, Landroidx/compose/foundation/text/selection/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;F)Landroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;

    .line 25
    .line 26
    iget-wide v2, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲苏兰世:J

    .line 27
    .line 28
    const/4 v4, 0x5

    .line 29
    invoke-direct {v1, v2, v3, v4}, Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;-><init>(JI)V

    .line 30
    .line 31
    .line 32
    new-instance v2, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世苏哲兰;

    .line 33
    .line 34
    iget-object v3, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 35
    .line 36
    iget-boolean p0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲兰苏世:Z

    .line 37
    .line 38
    invoke-direct {v2, v3, p0, v0, v1}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪世苏哲兰;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;ZLandroidx/compose/ui/graphics/飘花落叶言子楪苏世哲兰;Landroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroidx/compose/ui/draw/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/draw/飘花落叶言子楪苏哲世兰;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
