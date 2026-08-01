.class public final L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰哲苏;


# instance fields
.field public volatile 飘花落叶言子楪哲兰世苏:Z

.field public final 飘花落叶言子楪哲苏兰世:Ljava/util/Set;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/WeakHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroidx/fragment/app/FragmentActivity;)V
    .locals 2

    .line 1
    iget-boolean v0, p0, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    iget-object v0, p0, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    :goto_0
    return-void

    .line 15
    :cond_1
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世哲兰苏;

    .line 28
    .line 29
    invoke-direct {v1, p0, p1}, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪世兰苏哲;Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
