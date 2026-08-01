.class public final synthetic Landroidx/lifecycle/飘花落叶言子世兰苏哲楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 4
    .line 5
    iget v1, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iput-boolean v2, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 11
    .line 12
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_PAUSE:Landroidx/lifecycle/Lifecycle$Event;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    iget v1, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    iget-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Z

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 28
    .line 29
    .line 30
    iput-boolean v2, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 31
    .line 32
    :cond_1
    return-void
.end method
