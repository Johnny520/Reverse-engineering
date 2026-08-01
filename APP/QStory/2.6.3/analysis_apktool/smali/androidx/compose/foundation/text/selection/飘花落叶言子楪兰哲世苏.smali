.class public final synthetic Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

.field public final synthetic 飘花落叶言子楪兰世苏哲:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:I

.field public final synthetic 飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;IIL飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Lkotlin/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;

    .line 5
    .line 6
    iput p2, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:I

    .line 7
    .line 8
    iput p3, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰苏世:I

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 11
    .line 12
    iput-object p5, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲苏兰世:Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 8
    .line 9
    iget-object v3, v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世哲苏:Lkotlin/飘花落叶言子楪苏世哲兰;

    .line 10
    .line 11
    invoke-interface {v3}, Lkotlin/飘花落叶言子楪苏世哲兰;->getValue()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    check-cast v3, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    iget-object v4, v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪兰世苏哲:L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 22
    .line 23
    iget-boolean v5, v4, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Z

    .line 24
    .line 25
    invoke-virtual {v4}, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世哲兰()Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    sget-object v6, Landroidx/compose/foundation/text/selection/CrossStatus;->CROSSED:Landroidx/compose/foundation/text/selection/CrossStatus;

    .line 30
    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x1

    .line 33
    if-ne v4, v6, :cond_0

    .line 34
    .line 35
    move v4, v8

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v4, v7

    .line 38
    :goto_0
    iget v6, v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰世苏:I

    .line 39
    .line 40
    invoke-virtual {v2, v6}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世(I)J

    .line 41
    .line 42
    .line 43
    move-result-wide v9

    .line 44
    sget v11, Landroidx/compose/ui/text/飘花落叶言子世哲苏兰楪;->飘花落叶言子楪世哲苏兰:I

    .line 45
    .line 46
    const/16 v11, 0x20

    .line 47
    .line 48
    shr-long v11, v9, v11

    .line 49
    .line 50
    long-to-int v11, v11

    .line 51
    iget-object v12, v2, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 52
    .line 53
    invoke-virtual {v12, v11}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 54
    .line 55
    .line 56
    move-result v13

    .line 57
    iget v14, v12, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世兰哲苏:I

    .line 58
    .line 59
    if-ne v13, v3, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    if-lt v3, v14, :cond_2

    .line 63
    .line 64
    add-int/lit8 v11, v14, -0x1

    .line 65
    .line 66
    invoke-virtual {v2, v11}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 67
    .line 68
    .line 69
    move-result v11

    .line 70
    goto :goto_1

    .line 71
    :cond_2
    invoke-virtual {v2, v3}, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰(I)I

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    :goto_1
    const-wide v15, 0xffffffffL

    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    and-long/2addr v9, v15

    .line 81
    long-to-int v9, v9

    .line 82
    invoke-virtual {v12, v9}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-ne v10, v3, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    iget-object v2, v2, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 90
    .line 91
    if-lt v3, v14, :cond_4

    .line 92
    .line 93
    sub-int/2addr v14, v8

    .line 94
    invoke-virtual {v2, v14, v7}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(IZ)I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    goto :goto_2

    .line 99
    :cond_4
    invoke-virtual {v2, v3, v7}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲苏兰(IZ)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    :goto_2
    iget v0, v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪哲兰苏世:I

    .line 104
    .line 105
    if-ne v11, v0, :cond_5

    .line 106
    .line 107
    invoke-virtual {v1, v9}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :cond_5
    if-ne v9, v0, :cond_6

    .line 113
    .line 114
    invoke-virtual {v1, v11}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    return-object v0

    .line 119
    :cond_6
    xor-int v0, v5, v4

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    if-gt v6, v9, :cond_8

    .line 124
    .line 125
    goto :goto_3

    .line 126
    :cond_7
    if-lt v6, v11, :cond_9

    .line 127
    .line 128
    :cond_8
    move v11, v9

    .line 129
    :cond_9
    :goto_3
    invoke-virtual {v1, v11}, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏兰哲(I)Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰世苏哲;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    return-object v0
.end method
