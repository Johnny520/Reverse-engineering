.class public final synthetic L飘花落叶言楪子兰世哲苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/util/function/BiFunction;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/util/function/BiFunction;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪子兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪子兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/function/BiFunction;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, L飘花落叶言楪子兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, L飘花落叶言楪子兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/function/BiFunction;

    .line 12
    .line 13
    invoke-interface {p0, p1, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object p0, p0, L飘花落叶言楪子兰世哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Ljava/util/function/BiFunction;

    .line 19
    .line 20
    const-class v0, Ljava/math/BigDecimal;

    .line 21
    .line 22
    invoke-interface {p0, p1, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, Ljava/math/BigDecimal;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
