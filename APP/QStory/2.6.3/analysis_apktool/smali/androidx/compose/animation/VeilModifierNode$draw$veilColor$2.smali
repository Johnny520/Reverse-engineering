.class final Landroidx/compose/animation/VeilModifierNode$draw$veilColor$2;
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
        "Landroidx/compose/animation/EnterExitState;",
        "it",
        "Landroidx/compose/ui/graphics/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u54f2\u4e16\u82cf;",
        "invoke-vNxB06k",
        "(Landroidx/compose/animation/EnterExitState;)J",
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
.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子苏兰哲世楪;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子苏兰哲世楪;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/VeilModifierNode$draw$veilColor$2;->this$0:Landroidx/compose/animation/飘花落叶言子苏兰哲世楪;

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
.method public synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Landroidx/compose/animation/EnterExitState;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/compose/animation/VeilModifierNode$draw$veilColor$2;->invoke-vNxB06k(Landroidx/compose/animation/EnterExitState;)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    new-instance v0, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/graphics/飘花落叶言子楪兰哲世苏;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final invoke-vNxB06k(Landroidx/compose/animation/EnterExitState;)J
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/animation/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏哲兰:[I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    const/4 v1, 0x0

    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x2

    .line 14
    if-eq p1, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x3

    .line 17
    if-ne p1, v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Landroidx/compose/animation/VeilModifierNode$draw$veilColor$2;->this$0:Landroidx/compose/animation/飘花落叶言子苏兰哲世楪;

    .line 20
    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    throw v1

    .line 25
    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    .line 26
    .line 27
    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    iget-object p0, p0, Landroidx/compose/animation/VeilModifierNode$draw$veilColor$2;->this$0:Landroidx/compose/animation/飘花落叶言子苏兰哲世楪;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    throw v1

    .line 37
    :cond_2
    iget-object p0, p0, Landroidx/compose/animation/VeilModifierNode$draw$veilColor$2;->this$0:Landroidx/compose/animation/飘花落叶言子苏兰哲世楪;

    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    throw v1
.end method
