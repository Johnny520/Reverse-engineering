.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u54f2\u5170;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "()V",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 0

    .line 45
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;->invoke()V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iget-boolean v1, v0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪兰世哲苏:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->getView()Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 24
    .line 25
    if-ne v0, v1, :cond_0

    .line 26
    .line 27
    invoke-static {v1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;)Landroidx/compose/ui/node/飘花落叶言子苏哲兰世楪;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$runUpdate$1;->this$0:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 32
    .line 33
    sget-object v1, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲兰苏楪:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->getUpdate()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 40
    .line 41
    invoke-virtual {v0, p0, v1, v2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    return-void
.end method
