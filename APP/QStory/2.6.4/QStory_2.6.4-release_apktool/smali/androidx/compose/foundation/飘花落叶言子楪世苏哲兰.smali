.class public final synthetic Landroidx/compose/foundation/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲楪兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    invoke-interface {p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object v0, Landroidx/compose/foundation/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 17
    .line 18
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Landroidx/compose/foundation/飘花落叶言子世兰哲苏楪;

    .line 23
    .line 24
    instance-of v1, v0, Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v2, "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: "

    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-static {v1}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object v1, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏兰楪:Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;

    .line 46
    .line 47
    check-cast v0, Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;

    .line 48
    .line 49
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世哲苏兰楪:Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;

    .line 50
    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_3

    .line 58
    .line 59
    iget-object v0, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世兰楪苏哲:Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;

    .line 60
    .line 61
    if-nez v0, :cond_1

    .line 62
    .line 63
    iget-boolean v1, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子苏楪世兰哲:Z

    .line 64
    .line 65
    if-nez v1, :cond_3

    .line 66
    .line 67
    :cond_1
    if-eqz v0, :cond_2

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子哲兰苏楪世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    const/4 v0, 0x0

    .line 73
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子世兰楪苏哲:Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;

    .line 74
    .line 75
    invoke-virtual {p0}, Landroidx/compose/foundation/飘花落叶言子楪世苏兰哲;->飘花落叶言子兰世苏哲楪()V

    .line 76
    .line 77
    .line 78
    :cond_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
