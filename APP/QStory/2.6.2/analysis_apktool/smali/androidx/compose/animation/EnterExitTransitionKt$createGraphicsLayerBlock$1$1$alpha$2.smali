.class final Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

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
        "\u0000\u0010\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "<anonymous>",
        "",
        "it",
        "Landroidx/compose/animation/EnterExitState;",
        "invoke",
        "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Float;"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

.field final synthetic $exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;


# direct methods
.method public constructor <init>(Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2;->$enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2;->$exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

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
.method public final invoke(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Float;
    .locals 3

    .line 1
    sget-object v0, Landroidx/compose/animation/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪世苏哲兰:[I

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
    const/high16 v1, 0x3f800000    # 1.0f

    .line 11
    .line 12
    if-eq p1, v0, :cond_2

    .line 13
    .line 14
    const/4 v0, 0x2

    .line 15
    const/4 v2, 0x0

    .line 16
    if-eq p1, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x3

    .line 19
    if-ne p1, v0, :cond_0

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2;->$exit:Landroidx/compose/animation/飘花落叶言子世苏兰楪哲;

    .line 22
    .line 23
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;

    .line 24
    .line 25
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 26
    .line 27
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/飘花落叶言子世哲楪苏兰;

    .line 28
    .line 29
    if-eqz p0, :cond_2

    .line 30
    .line 31
    :goto_0
    move v1, v2

    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    return-object p0

    .line 38
    :cond_1
    iget-object p0, p0, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2;->$enter:Landroidx/compose/animation/飘花落叶言子世苏哲楪兰;

    .line 39
    .line 40
    check-cast p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;

    .line 41
    .line 42
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;

    .line 43
    .line 44
    iget-object p0, p0, Landroidx/compose/animation/飘花落叶言子苏兰世哲楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/animation/飘花落叶言子世哲楪苏兰;

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    :goto_1
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 54
    check-cast p1, Landroidx/compose/animation/EnterExitState;

    invoke-virtual {p0, p1}, Landroidx/compose/animation/EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2;->invoke(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Float;

    move-result-object p0

    return-object p0
.end method
