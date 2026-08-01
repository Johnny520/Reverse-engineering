.class public final synthetic Landroidx/lifecycle/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/lifecycle/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayDeque;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Ljava/lang/Runnable;

    .line 8
    .line 9
    invoke-virtual {v1, p0}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/lifecycle/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰()V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string p0, "cannot enqueue any more runnables"

    .line 20
    .line 21
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method
