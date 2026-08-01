.class public final synthetic Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:J

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(JL飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:J

    .line 8
    .line 9
    iput-object p3, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/ui/graphics/飘花落叶言子楪兰世苏哲;J)V
    .locals 1

    .line 12
    const/4 v0, 0x1

    iput v0, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    iput-wide p2, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:J

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-wide v1, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:J

    .line 4
    .line 5
    iget-object p0, p0, Lio/modelcontextprotocol/kotlin/sdk/shared/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Landroidx/compose/ui/graphics/飘花落叶言子楪兰世苏哲;

    .line 11
    .line 12
    check-cast p0, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;

    .line 13
    .line 14
    invoke-virtual {p0, v1, v2}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰苏楪;->飘花落叶言子楪世苏兰哲(J)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    check-cast p0, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v3, "Request timed out after "

    .line 24
    .line 25
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lkotlin/time/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, "ms: "

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-interface {p0}, L飘花落叶言世子楪兰苏哲/飘花落叶言楪苏哲世子兰;->getMethod()L飘花落叶言世子楪兰苏哲/飘花落叶言楪子哲世苏兰;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
