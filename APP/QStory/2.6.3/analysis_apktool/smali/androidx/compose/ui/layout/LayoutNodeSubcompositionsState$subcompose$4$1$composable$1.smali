.class final Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1;
.super Lkotlin/jvm/internal/Lambda;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/Lambda;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0003\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lkotlin/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u5170\u82cf\u54f2\u4e16;",
        "invoke",
        "(Landroidx/compose/runtime/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u54f2\u4e16\u5170;I)V",
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
.field final synthetic $content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
        }
    .end annotation
.end field

.field final synthetic $nodeState:Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/layout/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u54f2\u82cf;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1;->$nodeState:Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lkotlin/jvm/internal/Lambda;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 133
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1;->invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 4

    .line 1
    and-int/lit8 v0, p2, 0x3

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    move v0, v3

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, v2

    .line 11
    :goto_0
    and-int/2addr p2, v3

    .line 12
    check-cast p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 13
    .line 14
    invoke-virtual {p1, p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    if-eqz p2, :cond_6

    .line 19
    .line 20
    iget-object p2, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1;->$nodeState:Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;

    .line 21
    .line 22
    iget-object p2, p2, Landroidx/compose/ui/layout/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 23
    .line 24
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 25
    .line 26
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    iget-object p0, p0, Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$subcompose$4$1$composable$1;->$content:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;

    .line 37
    .line 38
    invoke-virtual {p1, p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰(Z)Z

    .line 42
    .line 43
    .line 44
    move-result p2

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-interface {p0, p1, p2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    iget p0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世:I

    .line 56
    .line 57
    if-nez p0, :cond_2

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    const-string p0, "No nodes can be emitted before calling deactivateToEndGroup"

    .line 61
    .line 62
    invoke-static {p0}, Landroidx/compose/runtime/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    :goto_1
    iget-boolean p0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲:Z

    .line 66
    .line 67
    if-nez p0, :cond_4

    .line 68
    .line 69
    if-nez p2, :cond_3

    .line 70
    .line 71
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪苏哲()V

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_3
    iget-object p0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世哲兰;

    .line 76
    .line 77
    iget p2, p0, Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 78
    .line 79
    iget p0, p0, Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏世兰哲:I

    .line 80
    .line 81
    iget-object v0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲苏楪兰:L飘花落叶言子世苏楪兰哲/飘花落叶言子楪世苏兰哲;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, L飘花落叶言子世苏楪兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Z)V

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, L飘花落叶言子世苏楪兰哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子世苏楪兰哲/飘花落叶言子楪世苏哲兰;

    .line 90
    .line 91
    iget-object v0, v0, L飘花落叶言子世苏楪兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:L飘花落叶言子世苏楪兰哲/飘花落叶言子世哲楪苏兰;

    .line 92
    .line 93
    sget-object v1, L飘花落叶言子世苏楪兰哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子世苏楪兰哲/飘花落叶言子楪苏哲世兰;

    .line 94
    .line 95
    invoke-virtual {v0, v1}, L飘花落叶言子世苏楪兰哲/飘花落叶言子世哲楪苏兰;->飘花落叶言子世苏楪兰哲(L飘花落叶言世楪哲兰子苏/飘花落叶言子楪世哲兰苏;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪兰世苏哲:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-static {v0, p2, p0}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪苏哲兰世(Ljava/util/List;II)V

    .line 101
    .line 102
    .line 103
    iget-object p0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世哲兰;

    .line 104
    .line 105
    invoke-virtual {p0}, Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪兰世哲苏()V

    .line 106
    .line 107
    .line 108
    :cond_4
    :goto_2
    iget-boolean p0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏哲兰:Z

    .line 109
    .line 110
    if-eqz p0, :cond_5

    .line 111
    .line 112
    iget-object p0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世哲兰;

    .line 113
    .line 114
    iget p0, p0, Landroidx/compose/runtime/composer/gapbuffer/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏哲世兰:I

    .line 115
    .line 116
    iget p2, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲:I

    .line 117
    .line 118
    if-ne p0, p2, :cond_5

    .line 119
    .line 120
    const/4 p0, -0x1

    .line 121
    iput p0, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏兰哲:I

    .line 122
    .line 123
    iput-boolean v2, p1, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪苏哲兰:Z

    .line 124
    .line 125
    :cond_5
    invoke-virtual {p1, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :cond_6
    invoke-virtual {p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 130
    .line 131
    .line 132
    return-void
.end method
