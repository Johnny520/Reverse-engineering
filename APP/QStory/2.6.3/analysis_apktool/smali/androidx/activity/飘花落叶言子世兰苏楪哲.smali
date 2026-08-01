.class public final Landroidx/activity/飘花落叶言子世兰苏楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroidx/activity/飘花落叶言子世哲兰苏楪;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/activity/飘花落叶言子世兰楪苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;Landroid/view/View;Landroidx/activity/飘花落叶言子世兰楪苏哲;Landroidx/activity/飘花落叶言子世哲兰苏楪;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/activity/飘花落叶言子世兰楪苏哲;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰世苏哲:Landroidx/activity/飘花落叶言子世哲兰苏楪;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p1, Landroid/graphics/Rect;

    .line 5
    .line 6
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰世苏:Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {v0, p1}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    .line 12
    .line 13
    .line 14
    iget-object v1, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲苏兰世:Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;

    .line 15
    .line 16
    check-cast v1, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;

    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lkotlinx/coroutines/channels/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪兰哲苏世(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v1, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/activity/飘花落叶言子世兰楪苏哲;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰世苏哲:Landroidx/activity/飘花落叶言子世哲兰苏楪;

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪哲兰苏世:Landroidx/activity/飘花落叶言子世兰楪苏哲;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Landroidx/activity/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪兰世苏哲:Landroidx/activity/飘花落叶言子世哲兰苏楪;

    .line 14
    .line 15
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
