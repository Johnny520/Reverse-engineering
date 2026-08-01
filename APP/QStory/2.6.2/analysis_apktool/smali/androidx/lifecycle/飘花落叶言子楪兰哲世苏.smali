.class public final synthetic Landroidx/lifecycle/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子楪兰哲苏世;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/飘花落叶言子楪兰哲苏世;Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子楪兰哲苏世;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏世兰哲(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 2

    .line 1
    invoke-interface {p1}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    check-cast p2, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 6
    .line 7
    iget-object p2, p2, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 8
    .line 9
    sget-object v0, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子楪兰哲苏世;

    .line 12
    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;

    .line 17
    .line 18
    invoke-interface {p0, p1}, Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世兰哲(Ljava/util/concurrent/CancellationException;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1}, Landroidx/lifecycle/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏哲兰()V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-interface {p1}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    check-cast p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 30
    .line 31
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 32
    .line 33
    iget-object p1, v1, Landroidx/lifecycle/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世苏兰哲:Landroidx/lifecycle/Lifecycle$State;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    iget-object p1, v1, Landroidx/lifecycle/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;

    .line 40
    .line 41
    if-gez p0, :cond_1

    .line 42
    .line 43
    const/4 p0, 0x1

    .line 44
    iput-boolean p0, p1, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Z

    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-boolean p0, p1, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Z

    .line 48
    .line 49
    if-nez p0, :cond_2

    .line 50
    .line 51
    return-void

    .line 52
    :cond_2
    iget-boolean p0, p1, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏:Z

    .line 53
    .line 54
    if-nez p0, :cond_3

    .line 55
    .line 56
    const/4 p0, 0x0

    .line 57
    iput-boolean p0, p1, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世:Z

    .line 58
    .line 59
    invoke-virtual {p1}, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :cond_3
    const-string p0, "Cannot resume a finished dispatcher"

    .line 64
    .line 65
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method
