.class public final Landroidx/fragment/app/飘花落叶言子楪哲兰苏世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪哲世苏兰(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 0

    .line 1
    sget-object p1, Landroidx/lifecycle/Lifecycle$Event;->ON_STOP:Landroidx/lifecycle/Lifecycle$Event;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 6
    .line 7
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->cancelPendingInputEvents()V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
