.class final Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $$changed:I

.field final synthetic $$default:I

.field final synthetic $content:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;"
        }
    .end annotation
.end field

.field final synthetic $modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u5170\u4e16\u82cf;",
            "II)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$content:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    iput p3, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$$changed:I

    .line 6
    .line 7
    iput p4, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$$default:I

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 118
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 7

    .line 1
    iget-object p2, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$modifier:Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$content:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;

    .line 4
    .line 5
    iget v1, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$$changed:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    or-int/2addr v1, v2

    .line 9
    invoke-static {v1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲兰苏楪(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget p0, p0, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;->$$default:I

    .line 14
    .line 15
    sget v3, Landroidx/compose/animation/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏哲兰:I

    .line 16
    .line 17
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 18
    .line 19
    const v3, 0x2686f612

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 23
    .line 24
    .line 25
    and-int/lit8 v3, p0, 0x1

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    or-int/lit8 v4, v1, 0x6

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    and-int/lit8 v4, v1, 0x6

    .line 33
    .line 34
    if-nez v4, :cond_2

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_1

    .line 41
    .line 42
    const/4 v4, 0x4

    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const/4 v4, 0x2

    .line 45
    :goto_0
    or-int/2addr v4, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move v4, v1

    .line 48
    :goto_1
    and-int/lit8 v5, v1, 0x30

    .line 49
    .line 50
    if-nez v5, :cond_4

    .line 51
    .line 52
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_3

    .line 57
    .line 58
    const/16 v5, 0x20

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_3
    const/16 v5, 0x10

    .line 62
    .line 63
    :goto_2
    or-int/2addr v4, v5

    .line 64
    :cond_4
    and-int/lit8 v5, v4, 0x13

    .line 65
    .line 66
    const/16 v6, 0x12

    .line 67
    .line 68
    if-eq v5, v6, :cond_5

    .line 69
    .line 70
    move v5, v2

    .line 71
    goto :goto_3

    .line 72
    :cond_5
    const/4 v5, 0x0

    .line 73
    :goto_3
    and-int/2addr v2, v4

    .line 74
    invoke-virtual {p1, v2, v5}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-eqz v2, :cond_7

    .line 79
    .line 80
    if-eqz v3, :cond_6

    .line 81
    .line 82
    sget-object p2, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 83
    .line 84
    :cond_6
    new-instance v2, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$1;

    .line 85
    .line 86
    invoke-direct {v2, p2, v0}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$1;-><init>(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;)V

    .line 87
    .line 88
    .line 89
    const v3, 0x74285a2c

    .line 90
    .line 91
    .line 92
    invoke-static {v3, v2, p1}, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲兰苏(ILkotlin/飘花落叶言子楪世兰苏哲;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Landroidx/compose/runtime/internal/飘花落叶言子楪世兰苏哲;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    const/4 v3, 0x6

    .line 97
    invoke-static {v2, p1, v3}, Landroidx/compose/animation/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪世苏哲兰(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰苏世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    .line 98
    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_7
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 102
    .line 103
    .line 104
    :goto_4
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    if-eqz p1, :cond_8

    .line 109
    .line 110
    new-instance v2, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;

    .line 111
    .line 112
    invoke-direct {v2, p2, v0, v1, p0}, Landroidx/compose/animation/SharedTransitionScopeKt$SharedTransitionLayout$2;-><init>(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;II)V

    .line 113
    .line 114
    .line 115
    iput-object v2, p1, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 116
    .line 117
    :cond_8
    return-void
.end method
