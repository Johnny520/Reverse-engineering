.class public final synthetic Landroidx/compose/foundation/lazy/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;I)V
    .locals 0

    .line 10
    const/4 p1, 0x0

    iput p1, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget p0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 11
    .line 12
    .line 13
    new-instance p1, Ljava/lang/IndexOutOfBoundsException;

    .line 14
    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, "Collection doesn\'t contain element at index "

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x2e

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-direct {p1, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw p1

    .line 38
    :pswitch_0
    check-cast p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲兰楪;

    .line 39
    .line 40
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    const/4 v1, 0x0

    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move-object v2, v1

    .line 53
    :goto_0
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-static {v0, v3, v2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 58
    .line 59
    .line 60
    iget v0, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:I

    .line 61
    .line 62
    const/4 v2, -0x1

    .line 63
    if-ne v0, v2, :cond_1

    .line 64
    .line 65
    const/4 v0, 0x2

    .line 66
    :cond_1
    const/4 v2, 0x0

    .line 67
    :goto_1
    if-ge v2, v0, :cond_3

    .line 68
    .line 69
    add-int v3, p0, v2

    .line 70
    .line 71
    iget-object v4, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏兰哲楪;

    .line 72
    .line 73
    iget-object v5, v4, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;

    .line 74
    .line 75
    if-nez v5, :cond_2

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_2
    iget-object v6, p1, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Ljava/util/ArrayList;

    .line 79
    .line 80
    iget-object v4, v4, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 81
    .line 82
    new-instance v7, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;

    .line 83
    .line 84
    invoke-direct {v7, v5, v3, v4, v1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪世兰哲;-><init>(Landroidx/compose/foundation/lazy/layout/飘花落叶言子苏楪哲世兰;ILandroidx/appcompat/app/飘花落叶言子苏楪世兰哲;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 94
    .line 95
    return-object p0

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
