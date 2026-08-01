.class public final Landroidx/compose/ui/text/input/飘花落叶言子楪哲苏世兰;
.super Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# virtual methods
.method public final performHandwritingGesture(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/inputmethod/InputConnection;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰世哲苏(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final previewHandwritingGesture(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/text/input/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪世苏兰哲:Landroid/view/inputmethod/InputConnection;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-static {p0, p1, p2}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪兰苏世哲(Landroid/view/inputmethod/InputConnection;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method
