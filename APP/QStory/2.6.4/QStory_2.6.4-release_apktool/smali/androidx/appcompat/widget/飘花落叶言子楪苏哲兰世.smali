.class public final Landroidx/appcompat/widget/飘花落叶言子楪苏哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子楪苏世兰哲;


# direct methods
.method public constructor <init>(Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;Landroidx/appcompat/widget/飘花落叶言子楪苏世兰哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/appcompat/widget/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/appcompat/widget/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子楪苏世兰哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/appcompat/widget/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget-object v2, v1, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世哲苏:L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏世兰哲;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    invoke-interface {v2, v1}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪哲世兰苏(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object v1, v0, Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪兰哲世苏:L飘花落叶言子楪苏兰世哲/飘花落叶言子楪兰哲苏世;

    .line 15
    .line 16
    check-cast v1, Landroid/view/View;

    .line 17
    .line 18
    if-eqz v1, :cond_3

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪哲苏兰世:Landroidx/appcompat/widget/飘花落叶言子楪苏世兰哲;

    .line 27
    .line 28
    invoke-virtual {p0}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, p0, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰哲苏:Landroid/view/View;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    const/4 v1, 0x0

    .line 41
    invoke-virtual {p0, v1, v1, v1, v1}, L飘花落叶言子楪苏兰世哲/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏(IIZZ)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iput-object p0, v0, Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子世苏哲兰楪:Landroidx/appcompat/widget/飘花落叶言子楪苏世兰哲;

    .line 45
    .line 46
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 47
    iput-object p0, v0, Landroidx/appcompat/widget/飘花落叶言子楪哲世兰苏;->飘花落叶言子世苏兰哲楪:Landroidx/appcompat/widget/飘花落叶言子楪苏哲兰世;

    .line 48
    .line 49
    return-void
.end method
