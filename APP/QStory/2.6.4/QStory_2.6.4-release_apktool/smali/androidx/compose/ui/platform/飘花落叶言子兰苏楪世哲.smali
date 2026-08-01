.class public final Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/runtime/飘花落叶言子楪苏兰世哲;
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

.field public 飘花落叶言子楪兰世苏哲:Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

.field public final 飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

.field public 飘花落叶言子楪哲兰苏世:Z

.field public final 飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 7
    .line 8
    sget-object p1, Landroidx/compose/ui/platform/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final dispose()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getView()Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x240903dd

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪兰世苏哲:Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {v0, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 26
    .line 27
    .line 28
    :cond_0
    iput-object v2, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪兰世苏哲:Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 29
    .line 30
    :cond_1
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;

    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子楪哲世兰苏;->dispose()V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/compose/ui/platform/WrappedComposition$setContent$1;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/platform/WrappedComposition$setContent$1;-><init>(Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->setOnReadyForComposition(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final 飘花落叶言子楪哲世苏兰(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->dispose()V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    .line 10
    .line 11
    if-ne p2, p1, :cond_1

    .line 12
    .line 13
    iget-boolean p1, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪哲兰苏世:Z

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪兰世哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroidx/compose/ui/platform/飘花落叶言子兰苏楪世哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    return-void
.end method
