.class public final Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnDragListener;
.implements Landroidx/compose/ui/draganddrop/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final 飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子楪苏世兰哲;

.field public final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;

    .line 5
    .line 6
    invoke-direct {v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 7
    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    .line 11
    iput-wide v1, v0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪兰哲:J

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    new-instance v0, Landroidx/collection/飘花落叶言子楪苏世兰哲;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, v1}, Landroidx/collection/飘花落叶言子楪苏世兰哲;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子楪苏世兰哲;

    .line 22
    .line 23
    new-instance v0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏哲兰;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏哲兰;-><init>(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏兰哲;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏哲兰;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final onDrag(Landroid/view/View;Landroid/view/DragEvent;)Z
    .locals 4

    .line 1
    new-instance p1, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    invoke-direct {p1, p2}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;-><init>(Landroid/view/DragEvent;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/view/DragEvent;->getAction()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    iget-object v0, p0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/collection/飘花落叶言子楪苏世兰哲;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    iget-object p0, p0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;

    .line 14
    .line 15
    packed-switch p2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    return v1

    .line 19
    :pswitch_0
    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子哲兰苏世楪(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)V

    .line 20
    .line 21
    .line 22
    return v1

    .line 23
    :pswitch_1
    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子哲兰苏楪世(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)V

    .line 24
    .line 25
    .line 26
    return v1

    .line 27
    :pswitch_2
    new-instance p2, Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;

    .line 28
    .line 29
    invoke-direct {p2, p1}, Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;-><init>(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    sget-object v2, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 37
    .line 38
    if-eq p1, v2, :cond_0

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-static {p0, p2}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰苏哲(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    invoke-virtual {v0}, Landroidx/collection/飘花落叶言子楪苏世兰哲;->clear()V

    .line 45
    .line 46
    .line 47
    return v1

    .line 48
    :pswitch_3
    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子哲兰世苏楪(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    return p0

    .line 53
    :pswitch_4
    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子兰楪世苏哲(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)V

    .line 54
    .line 55
    .line 56
    return v1

    .line 57
    :pswitch_5
    new-instance p2, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 58
    .line 59
    invoke-direct {p2}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 60
    .line 61
    .line 62
    new-instance v1, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$1;

    .line 63
    .line 64
    invoke-direct {v1, p1, p0, p2}, Landroidx/compose/ui/draganddrop/DragAndDropNode$acceptDragAndDropTransfer$1;-><init>(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    sget-object v3, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 72
    .line 73
    if-eq v2, v3, :cond_1

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {p0, v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰苏哲(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-boolean p0, p2, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 80
    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    new-instance p2, Landroidx/collection/飘花落叶言子楪世苏兰哲;

    .line 85
    .line 86
    invoke-direct {p2, v0}, Landroidx/collection/飘花落叶言子楪世苏兰哲;-><init>(Landroidx/collection/飘花落叶言子楪苏世兰哲;)V

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-virtual {p2}, Landroidx/collection/飘花落叶言子楪世苏兰哲;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    invoke-virtual {p2}, Landroidx/collection/飘花落叶言子楪世苏兰哲;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲世兰;

    .line 100
    .line 101
    check-cast v0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;

    .line 102
    .line 103
    invoke-virtual {v0, p1}, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子兰楪世哲苏(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)V

    .line 104
    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_2
    return p0

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
