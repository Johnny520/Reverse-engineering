.class public abstract Landroidx/compose/animation/飘花落叶言子苏世兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/animation/core/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Map;

    .line 2
    .line 3
    new-instance v0, Landroidx/collection/飘花落叶言子世兰楪苏哲;

    .line 4
    .line 5
    invoke-direct {v0}, Landroidx/collection/飘花落叶言子世兰楪苏哲;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰苏世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 4

    .line 1
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, 0x71bea736

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    and-int/lit8 v0, p2, 0x6

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    :goto_0
    or-int/2addr v0, p2

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p2

    .line 26
    :goto_1
    and-int/lit8 v2, v0, 0x3

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-eq v2, v1, :cond_2

    .line 30
    .line 31
    move v1, v3

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    const/4 v1, 0x0

    .line 34
    :goto_2
    and-int/2addr v0, v3

    .line 35
    invoke-virtual {p1, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_3

    .line 40
    .line 41
    new-instance v0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;

    .line 42
    .line 43
    invoke-direct {v0, p0}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$1;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰苏世;)V

    .line 44
    .line 45
    .line 46
    const v1, 0x7af4a235

    .line 47
    .line 48
    .line 49
    invoke-static {v1, v0, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(ILkotlin/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/4 v1, 0x6

    .line 54
    invoke-static {v0, p1, v1}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 55
    .line 56
    .line 57
    goto :goto_3

    .line 58
    :cond_3
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 59
    .line 60
    .line 61
    :goto_3
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    new-instance v0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$2;

    .line 68
    .line 69
    invoke-direct {v0, p0, p2}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionScope$2;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰苏世;I)V

    .line 70
    .line 71
    .line 72
    iput-object v0, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 73
    .line 74
    :cond_4
    return-void
.end method
