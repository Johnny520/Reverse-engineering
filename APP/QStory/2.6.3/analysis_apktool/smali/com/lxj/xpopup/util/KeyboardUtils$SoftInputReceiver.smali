.class Lcom/lxj/xpopup/util/KeyboardUtils$SoftInputReceiver;
.super Landroid/os/ResultReceiver;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public 飘花落叶言子楪哲苏兰世:Landroid/content/Context;


# virtual methods
.method public final onReceiveResult(ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/os/ResultReceiver;->onReceiveResult(ILandroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    const/4 p2, 0x1

    .line 5
    if-eq p1, p2, :cond_0

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    if-ne p1, p2, :cond_3

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Lcom/lxj/xpopup/util/KeyboardUtils$SoftInputReceiver;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 11
    .line 12
    sget-object p2, Lcom/lxj/xpopup/util/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:Landroid/util/SparseArray;

    .line 13
    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    const-string p2, "input_method"

    .line 18
    .line 19
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    check-cast p1, Landroid/view/inputmethod/InputMethodManager;

    .line 24
    .line 25
    if-nez p1, :cond_2

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    const/4 p2, 0x0

    .line 29
    invoke-virtual {p1, p2, p2}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V

    .line 30
    .line 31
    .line 32
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 33
    iput-object p1, p0, Lcom/lxj/xpopup/util/KeyboardUtils$SoftInputReceiver;->飘花落叶言子楪哲苏兰世:Landroid/content/Context;

    .line 34
    .line 35
    return-void
.end method
