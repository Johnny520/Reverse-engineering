.class final Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u5170\u696a;",
        "owner",
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/ui/node/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u5170\u696a;)V",
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
.field final synthetic $layoutNode:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

.field final synthetic $this_run:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;->$this_run:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;->$layoutNode:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 78
    check-cast p1, Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;->invoke(Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;)V
    .locals 3

    .line 1
    instance-of v0, p1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;->$this_run:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    iget-object v1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;->$layoutNode:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 14
    .line 15
    invoke-virtual {p1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-virtual {v2}, Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;->getHolderToLayoutNode()Ljava/util/HashMap;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getAndroidViewsHandler$ui()Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Landroidx/compose/ui/platform/飘花落叶言子世兰楪苏哲;->getLayoutNodeToHolder()Ljava/util/HashMap;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    const/4 v2, 0x1

    .line 45
    invoke-virtual {v0, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 46
    .line 47
    .line 48
    new-instance v2, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;

    .line 49
    .line 50
    invoke-direct {v2, p1, v1, p1}, Landroidx/compose/ui/platform/飘花落叶言子楪哲苏世兰;-><init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v2}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    iget-object p1, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;->$this_run:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 57
    .line 58
    invoke-virtual {p1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->getView()Landroid/view/View;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/AndroidViewHolder$layoutNode$1$3;->$this_run:Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 67
    .line 68
    if-eq p1, p0, :cond_2

    .line 69
    .line 70
    invoke-virtual {p0}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->getView()Landroid/view/View;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    :cond_2
    return-void
.end method
