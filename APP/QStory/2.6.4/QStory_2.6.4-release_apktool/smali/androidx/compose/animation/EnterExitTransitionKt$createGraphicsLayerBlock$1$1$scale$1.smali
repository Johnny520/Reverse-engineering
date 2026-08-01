.class final Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u82cf\u4e16\u54f2\u5170\u696a;",
        "Landroidx/compose/animation/EnterExitState;",
        "Landroidx/compose/animation/core/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u82cf\u54f2\u5170;",
        "",
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
.field final synthetic $enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

.field final synthetic $exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1;->$enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1;->$exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

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
.method public final invoke(Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;)Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;
    .locals 2
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
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1;->$enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 12
    .line 13
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;

    .line 14
    .line 15
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Landroidx/compose/animation/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子世兰苏楪哲;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_1
    sget-object v0, Landroidx/compose/animation/EnterExitState;->PostExit:Landroidx/compose/animation/EnterExitState;

    .line 28
    .line 29
    invoke-interface {p1, v1, v0}, Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;->飘花落叶言子楪世苏兰哲(Landroidx/compose/animation/EnterExitState;Landroidx/compose/animation/EnterExitState;)Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_3

    .line 34
    .line 35
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1;->$exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

    .line 36
    .line 37
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;

    .line 38
    .line 39
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 40
    .line 41
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;

    .line 42
    .line 43
    if-eqz p0, :cond_2

    .line 44
    .line 45
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    sget-object p0, Landroidx/compose/animation/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子世兰苏楪哲;

    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_3
    sget-object p0, Landroidx/compose/animation/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/core/飘花落叶言子世兰苏楪哲;

    .line 52
    .line 53
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 54
    check-cast p1, Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1;->invoke(Landroidx/compose/animation/core/飘花落叶言子苏世哲兰楪;)Landroidx/compose/animation/core/飘花落叶言子世楪苏哲兰;

    move-result-object p0

    return-object p0
.end method
