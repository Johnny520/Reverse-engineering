.class public final Landroidx/lifecycle/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/lifecycle/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏世兰哲(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/lifecycle/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    .line 9
    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    invoke-interface {p1}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 17
    .line 18
    .line 19
    check-cast v1, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/lifecycle/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏兰哲()V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const-string p0, "Next event must be ON_CREATE, it was "

    .line 26
    .line 27
    invoke-static {p2, p0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    return-void

    .line 31
    :pswitch_0
    new-instance p0, Ljava/util/HashMap;

    .line 32
    .line 33
    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    .line 34
    .line 35
    .line 36
    check-cast v1, [Landroidx/lifecycle/飘花落叶言子楪哲苏兰世;

    .line 37
    .line 38
    array-length p0, v1

    .line 39
    const/4 p1, 0x0

    .line 40
    const/4 p2, 0x0

    .line 41
    if-gtz p0, :cond_2

    .line 42
    .line 43
    array-length p0, v1

    .line 44
    if-gtz p0, :cond_1

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    aget-object p0, v1, p2

    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    aget-object p0, v1, p2

    .line 51
    .line 52
    throw p1

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
