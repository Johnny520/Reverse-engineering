.class public final synthetic Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

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
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    sget-object v1, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 11
    .line 12
    invoke-interface {p0, v0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/16 p0, 0x50c

    .line 16
    .line 17
    invoke-static {p0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 26
    .line 27
    invoke-interface {p0, v0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    return-object v1

    .line 31
    :pswitch_1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-interface {p0, v0}, Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;->setValue(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :pswitch_2
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 42
    .line 43
    if-eqz p0, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    const-string p0, "Required value was null."

    .line 47
    .line 48
    invoke-static {p0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/Void;

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    :goto_0
    return-object p0

    .line 56
    :pswitch_3
    new-instance v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;

    .line 57
    .line 58
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    check-cast p0, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 63
    .line 64
    invoke-direct {v0, p0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏世兰哲;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
