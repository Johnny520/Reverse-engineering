.class public final synthetic L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;


# direct methods
.method public synthetic constructor <init>(L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪苏世兰哲(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_START:Landroidx/lifecycle/Lifecycle$Event;

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;

    .line 4
    .line 5
    if-ne p2, p1, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 12
    .line 13
    if-ne p2, p1, :cond_1

    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    iput-boolean p1, p0, L飘花落叶言子兰世楪哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世兰哲:Z

    .line 17
    .line 18
    :cond_1
    return-void
.end method
