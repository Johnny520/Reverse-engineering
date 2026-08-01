.class public final synthetic Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;I)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    iput-object p2, p0, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰苏世:Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子楪哲兰世苏:Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    iget-object p0, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/SpecialEffectsController$Operation$State;

    .line 30
    .line 31
    iget-object v0, v1, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世哲苏兰:Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;

    .line 32
    .line 33
    iget-object v0, v0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroidx/fragment/app/SpecialEffectsController$Operation$State;->applyState(Landroid/view/View;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    nop

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
