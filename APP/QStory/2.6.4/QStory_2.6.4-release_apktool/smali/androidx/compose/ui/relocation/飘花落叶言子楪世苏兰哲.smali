.class public abstract Landroidx/compose/ui/relocation/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 3
    .line 4
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    move-object v0, p0

    .line 13
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 14
    .line 15
    iget-object v1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 16
    .line 17
    iget-boolean v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    const-string v1, "visitAncestors called on an unattached node"

    .line 22
    .line 23
    invoke-static {v1}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    :cond_1
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 27
    .line 28
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 29
    .line 30
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_c

    .line 36
    .line 37
    iget-object v3, v1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 38
    .line 39
    iget-object v3, v3, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 40
    .line 41
    iget v3, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 42
    .line 43
    const/high16 v4, 0x80000

    .line 44
    .line 45
    and-int/2addr v3, v4

    .line 46
    if-eqz v3, :cond_a

    .line 47
    .line 48
    :goto_1
    if-eqz v0, :cond_a

    .line 49
    .line 50
    iget v3, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 51
    .line 52
    and-int/2addr v3, v4

    .line 53
    if-eqz v3, :cond_9

    .line 54
    .line 55
    move-object v3, v0

    .line 56
    move-object v5, v2

    .line 57
    :goto_2
    if-eqz v3, :cond_9

    .line 58
    .line 59
    instance-of v6, v3, Landroidx/compose/ui/relocation/飘花落叶言子楪世苏哲兰;

    .line 60
    .line 61
    if-eqz v6, :cond_2

    .line 62
    .line 63
    move-object v2, v3

    .line 64
    goto :goto_5

    .line 65
    :cond_2
    iget v6, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 66
    .line 67
    and-int/2addr v6, v4

    .line 68
    if-eqz v6, :cond_8

    .line 69
    .line 70
    instance-of v6, v3, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 71
    .line 72
    if-eqz v6, :cond_8

    .line 73
    .line 74
    move-object v6, v3

    .line 75
    check-cast v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 76
    .line 77
    iget-object v6, v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 78
    .line 79
    const/4 v7, 0x0

    .line 80
    move v8, v7

    .line 81
    :goto_3
    const/4 v9, 0x1

    .line 82
    if-eqz v6, :cond_7

    .line 83
    .line 84
    iget v10, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 85
    .line 86
    and-int/2addr v10, v4

    .line 87
    if-eqz v10, :cond_6

    .line 88
    .line 89
    add-int/lit8 v8, v8, 0x1

    .line 90
    .line 91
    if-ne v8, v9, :cond_3

    .line 92
    .line 93
    move-object v3, v6

    .line 94
    goto :goto_4

    .line 95
    :cond_3
    if-nez v5, :cond_4

    .line 96
    .line 97
    new-instance v5, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 98
    .line 99
    const/16 v9, 0x10

    .line 100
    .line 101
    new-array v9, v9, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 102
    .line 103
    invoke-direct {v5, v7, v9}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    if-eqz v3, :cond_5

    .line 107
    .line 108
    invoke-virtual {v5, v3}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    move-object v3, v2

    .line 112
    :cond_5
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    :cond_6
    :goto_4
    iget-object v6, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 116
    .line 117
    goto :goto_3

    .line 118
    :cond_7
    if-ne v8, v9, :cond_8

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_8
    invoke-static {v5}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    goto :goto_2

    .line 126
    :cond_9
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :cond_a
    invoke-virtual {v1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏世哲()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    if-eqz v1, :cond_b

    .line 134
    .line 135
    iget-object v0, v1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 136
    .line 137
    if-eqz v0, :cond_b

    .line 138
    .line 139
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_b
    move-object v0, v2

    .line 143
    goto :goto_0

    .line 144
    :cond_c
    :goto_5
    check-cast v2, Landroidx/compose/ui/relocation/飘花落叶言子楪世苏哲兰;

    .line 145
    .line 146
    if-nez v2, :cond_d

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_d
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    new-instance v0, Landroidx/compose/ui/relocation/BringIntoViewModifierNodeKt$bringIntoView$2;

    .line 154
    .line 155
    invoke-direct {v0, p1, p0}, Landroidx/compose/ui/relocation/BringIntoViewModifierNodeKt$bringIntoView$2;-><init>(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v2, p0, v0, p2}, Landroidx/compose/ui/relocation/飘花落叶言子楪世苏哲兰;->飘花落叶言子苏哲楪世兰(Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    sget-object p1, Lkotlin/coroutines/intrinsics/CoroutineSingletons;->COROUTINE_SUSPENDED:Lkotlin/coroutines/intrinsics/CoroutineSingletons;

    .line 163
    .line 164
    if-ne p0, p1, :cond_e

    .line 165
    .line 166
    return-object p0

    .line 167
    :cond_e
    :goto_6
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 168
    .line 169
    return-object p0
.end method
