.class public final synthetic Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/os/CancellationSignal$OnCancelListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCancel()V
    .locals 3

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-wide v1, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 10
    .line 11
    invoke-virtual {v0, v1, v2}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰苏哲(J)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    sget-wide v0, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世苏兰哲:J

    .line 19
    .line 20
    invoke-virtual {p0, v0, v1}, Landroidx/compose/foundation/text/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世兰哲苏(J)V

    .line 21
    .line 22
    .line 23
    :cond_1
    return-void
.end method
