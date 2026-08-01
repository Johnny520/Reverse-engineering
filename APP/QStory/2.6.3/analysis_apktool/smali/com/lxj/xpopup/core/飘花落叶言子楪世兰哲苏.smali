.class public final Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/lxj/xpopup/widget/飘花落叶言子楪世兰哲苏;


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;


# direct methods
.method public synthetic constructor <init>(Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世苏哲兰(F)V
    .locals 3

    .line 1
    iget-object p0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰:Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;

    .line 2
    .line 3
    check-cast p0, Lcom/lxj/xpopup/core/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->popupInfo:Lcom/lxj/xpopup/core/飘花落叶言子楪苏哲兰世;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lcom/lxj/xpopup/core/飘花落叶言子楪世兰苏哲;->shadowBgAnimator:L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    iget-object v1, v0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:Landroid/animation/ArgbEvaluator;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget v0, v0, L飘花落叶言楪哲苏兰世子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v1, p1, v2, v0}, Landroid/animation/ArgbEvaluator;->evaluate(FLjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
