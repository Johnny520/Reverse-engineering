.class public final Landroidx/appcompat/widget/飘花落叶言子哲苏世楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;

    .line 2
    .line 3
    iget-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世苏哲楪兰:Landroidx/appcompat/widget/飘花落叶言子哲苏楪世兰;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲兰楪苏:Landroidx/appcompat/widget/飘花落叶言子世苏哲兰楪;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne p2, v1, :cond_1

    .line 9
    .line 10
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    const/4 v1, 0x2

    .line 15
    if-ne p2, v1, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;->飘花落叶言子世哲楪苏兰:Landroid/os/Handler;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Landroidx/appcompat/widget/飘花落叶言子哲苏楪世兰;->run()V

    .line 30
    .line 31
    .line 32
    :cond_1
    return-void
.end method
