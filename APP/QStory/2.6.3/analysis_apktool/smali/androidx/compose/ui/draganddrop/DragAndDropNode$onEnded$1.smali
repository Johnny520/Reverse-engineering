.class final Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;
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
        "Landroidx/compose/ui/draganddrop/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;",
        "currentNode",
        "Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;",
        "invoke",
        "(Landroidx/compose/ui/draganddrop/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u4e16\u54f2\u5170;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;",
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
.field final synthetic $event:Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;->$event:Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final invoke(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;
    .locals 3

    .line 1
    iget-object v0, p1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->SkipSubtreeAndContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    iget-object v0, p1, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲世兰;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;->$event:Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;

    .line 15
    .line 16
    check-cast v0, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    new-instance v1, Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;

    .line 19
    .line 20
    invoke-direct {v1, p0}, Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;-><init>(Landroidx/compose/ui/draganddrop/飘花落叶言子楪世哲兰苏;)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v2, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 28
    .line 29
    if-eq p0, v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-static {v0, v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰苏哲(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 36
    iput-object p0, p1, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏哲世兰;

    .line 37
    .line 38
    iput-object p0, p1, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;

    .line 39
    .line 40
    sget-object p0, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 41
    .line 42
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 43
    check-cast p1, Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;

    invoke-virtual {p0, p1}, Landroidx/compose/ui/draganddrop/DragAndDropNode$onEnded$1;->invoke(Landroidx/compose/ui/draganddrop/飘花落叶言子楪苏世哲兰;)Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    move-result-object p0

    return-object p0
.end method
