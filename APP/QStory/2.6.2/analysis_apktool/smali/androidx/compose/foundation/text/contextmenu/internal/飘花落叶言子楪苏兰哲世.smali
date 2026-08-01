.class public final synthetic Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

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
    iget v0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "Required value was null."

    .line 5
    .line 6
    iget-object p0, p0, Landroidx/compose/foundation/text/contextmenu/internal/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    move-object v1, p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-static {v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/Void;

    .line 22
    .line 23
    .line 24
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()V

    .line 25
    .line 26
    .line 27
    :goto_0
    return-object v1

    .line 28
    :pswitch_0
    invoke-interface {p0}, Landroidx/compose/runtime/飘花落叶言子哲兰世楪苏;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    check-cast p0, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    move-object v1, p0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    invoke-static {v2}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/lang/Void;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲()V

    .line 42
    .line 43
    .line 44
    :goto_1
    return-object v1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
