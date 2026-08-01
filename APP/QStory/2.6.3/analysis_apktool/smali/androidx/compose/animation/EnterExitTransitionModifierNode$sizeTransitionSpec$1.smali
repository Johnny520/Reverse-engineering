.class final Landroidx/compose/animation/EnterExitTransitionModifierNode$sizeTransitionSpec$1;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u54f2\u5170\u696a;",
        "Landroidx/compose/animation/EnterExitState;",
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u54f2\u4e16\u696a\u5170/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u54f2\u5170\u696a;)Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
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
.field final synthetic this$0:Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionModifierNode$sizeTransitionSpec$1;->this$0:Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;

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
.method public final invoke(Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;)Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u54f2\u5170\u696a;",
            ")",
            "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;"
        }
    .end annotation

    .line 1
    sget-object v0, Landroidx/compose/animation/EnterExitState;->PreEnter:Landroidx/compose/animation/EnterExitState;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/animation/EnterExitState;->Visible:Landroidx/compose/animation/EnterExitState;

    .line 4
    .line 5
    invoke-interface {p1, v0, v1}, Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏兰哲(Landroidx/compose/animation/EnterExitState;Landroidx/compose/animation/EnterExitState;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionModifierNode$sizeTransitionSpec$1;->this$0:Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;

    .line 13
    .line 14
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 15
    .line 16
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;

    .line 17
    .line 18
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 19
    .line 20
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子楪兰世哲苏;

    .line 21
    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/compose/animation/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    sget-object v0, Landroidx/compose/animation/EnterExitState;->PostExit:Landroidx/compose/animation/EnterExitState;

    .line 28
    .line 29
    invoke-interface {p1, v1, v0}, Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏兰哲(Landroidx/compose/animation/EnterExitState;Landroidx/compose/animation/EnterExitState;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionModifierNode$sizeTransitionSpec$1;->this$0:Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;

    .line 36
    .line 37
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏楪兰哲;->飘花落叶言子世苏兰楪哲:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

    .line 38
    .line 39
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 42
    .line 43
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子楪兰世哲苏;

    .line 44
    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    iget-object v2, p0, Landroidx/compose/animation/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_1
    sget-object v2, Landroidx/compose/animation/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:Landroidx/compose/animation/core/飘花落叶言子世兰苏楪哲;

    .line 51
    .line 52
    :cond_2
    :goto_0
    if-nez v2, :cond_3

    .line 53
    .line 54
    sget-object p0, Landroidx/compose/animation/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世兰苏哲:Landroidx/compose/animation/core/飘花落叶言子世兰苏楪哲;

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_3
    return-object v2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 58
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/EnterExitTransitionModifierNode$sizeTransitionSpec$1;->invoke(Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;)Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    move-result-object p0

    return-object p0
.end method
