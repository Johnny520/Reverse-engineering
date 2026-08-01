.class public final synthetic Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;

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
    iget v0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲世兰苏楪;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/foundation/gestures/飘花落叶言子哲苏楪兰世;->飘花落叶言子苏世哲楪兰:Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 9
    .line 10
    move-object v0, p0

    .line 11
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 12
    .line 13
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 14
    .line 15
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪苏世哲()Landroidx/compose/ui/focus/FocusStateImpl;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-interface {v0}, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;->getHasFocus()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-interface {v0}, Landroidx/compose/ui/focus/飘花落叶言子世楪苏哲兰;->isFocused()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪世苏哲(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    goto :goto_0

    .line 43
    :cond_2
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 48
    .line 49
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getFocusOwner()Landroidx/compose/ui/focus/飘花落叶言子楪苏兰哲世;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;

    .line 54
    .line 55
    invoke-virtual {v0}, Landroidx/compose/ui/focus/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏世兰哲()Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-eqz v0, :cond_3

    .line 60
    .line 61
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-virtual {v0, p0}, Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;->飘花落叶言子兰楪世苏哲(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_3
    :goto_0
    return-object v1

    .line 70
    :pswitch_0
    iget-boolean p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 71
    .line 72
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
