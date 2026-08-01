.class public final synthetic Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    invoke-interface {p0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-ge v1, v0, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v1, -0x1

    .line 38
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;

    .line 50
    .line 51
    invoke-interface {v0}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;

    .line 56
    .line 57
    if-ltz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-ge p1, v1, :cond_2

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const-string v1, "Can\'t scroll to index "

    .line 67
    .line 68
    const-string v2, ", it is out of bounds [0, "

    .line 69
    .line 70
    invoke-static {p1, v1, v2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰哲世苏(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    const/16 v0, 0x29

    .line 82
    .line 83
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    :goto_2
    invoke-virtual {p0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪()Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2;

    .line 98
    .line 99
    const/4 v2, 0x0

    .line 100
    invoke-direct {v1, p0, p1, v2}, Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2;-><init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子世兰楪哲苏;ILkotlin/coroutines/飘花落叶言子楪世哲苏兰;)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x3

    .line 104
    invoke-static {v0, v2, v2, v1, p0}, Lkotlinx/coroutines/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;Lkotlin/coroutines/飘花落叶言子楪苏世兰哲;Lkotlinx/coroutines/CoroutineStart;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;I)Lkotlinx/coroutines/飘花落叶言子哲楪世兰苏;

    .line 105
    .line 106
    .line 107
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 108
    .line 109
    return-object p0

    .line 110
    nop

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
