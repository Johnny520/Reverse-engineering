.class public final Landroidx/compose/ui/platform/飘花落叶言子哲兰世楪苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子哲兰世楪苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子哲兰世楪苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;

    .line 2
    .line 3
    invoke-static {p0}, Landroidx/core/view/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/view/View;)Lkotlin/sequences/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-interface {p1}, Lkotlin/sequences/飘花落叶言子楪苏哲世兰;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Landroid/view/ViewParent;

    .line 22
    .line 23
    instance-of v1, v0, Landroid/view/View;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    check-cast v0, Landroid/view/View;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    const v1, 0x240901a3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 40
    .line 41
    if-eqz v1, :cond_1

    .line 42
    .line 43
    check-cast v0, Ljava/lang/Boolean;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    const/4 v0, 0x0

    .line 47
    :goto_0
    if-eqz v0, :cond_2

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    goto :goto_1

    .line 54
    :cond_2
    const/4 v0, 0x0

    .line 55
    :goto_1
    if-eqz v0, :cond_0

    .line 56
    .line 57
    return-void

    .line 58
    :cond_3
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰苏哲()V

    .line 59
    .line 60
    .line 61
    return-void
.end method
