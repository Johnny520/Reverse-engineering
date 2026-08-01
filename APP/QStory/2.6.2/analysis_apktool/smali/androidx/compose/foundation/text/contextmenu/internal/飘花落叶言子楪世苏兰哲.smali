.class public final synthetic Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-string v1, "result"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    move-object v0, p0

    .line 21
    check-cast v0, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 22
    .line 23
    invoke-interface {v0}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏世兰()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    move-object v3, p0

    .line 30
    :cond_0
    check-cast v3, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 31
    .line 32
    if-nez v3, :cond_1

    .line 33
    .line 34
    sget-object p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-interface {v4, v3}, Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;->飘花落叶言子苏哲兰世楪(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-wide/16 v0, 0x0

    .line 42
    .line 43
    invoke-interface {v3, v0, v1}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子世哲楪苏兰(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    invoke-virtual {p0, v0, v1}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰(J)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    :goto_0
    return-object p0

    .line 52
    :pswitch_0
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏世哲兰:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏哲兰;

    .line 53
    .line 54
    new-instance v5, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;

    .line 55
    .line 56
    const/4 v6, 0x2

    .line 57
    invoke-direct {v5, p0, v4, v6}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;Landroidx/compose/foundation/text/contextmenu/provider/飘花落叶言子楪世兰哲苏;I)V

    .line 58
    .line 59
    .line 60
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 61
    .line 62
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 63
    .line 64
    .line 65
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 66
    .line 67
    new-instance v6, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;

    .line 68
    .line 69
    invoke-direct {v6, v4, v2, v5}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const-string v2, "positioner"

    .line 73
    .line 74
    invoke-virtual {p0, v2, v0, v6}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 75
    .line 76
    .line 77
    iget-object p0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 78
    .line 79
    if-eqz p0, :cond_2

    .line 80
    .line 81
    check-cast p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 82
    .line 83
    return-object p0

    .line 84
    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    throw v3

    .line 88
    :pswitch_1
    iget-object v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世苏哲兰;

    .line 89
    .line 90
    new-instance v5, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲苏兰;

    .line 91
    .line 92
    invoke-direct {v5, v4, v2}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;I)V

    .line 93
    .line 94
    .line 95
    new-instance v4, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 96
    .line 97
    invoke-direct {v4}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 98
    .line 99
    .line 100
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰苏哲:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 101
    .line 102
    new-instance v6, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;

    .line 103
    .line 104
    invoke-direct {v6, v4, v2, v5}, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪世哲兰苏;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    const-string v2, "dataBuilder"

    .line 108
    .line 109
    invoke-virtual {p0, v2, v0, v6}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 110
    .line 111
    .line 112
    iget-object p0, v4, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 113
    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    check-cast p0, L飘花落叶言子世楪苏哲兰/飘花落叶言子楪世哲苏兰;

    .line 117
    .line 118
    return-object p0

    .line 119
    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v3

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
