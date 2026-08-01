.class public abstract Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/node/飘花落叶言子苏世兰哲楪;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/compose/ui/node/飘花落叶言子苏世兰哲楪;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Landroidx/compose/ui/node/飘花落叶言子苏世兰哲楪;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/node/飘花落叶言子苏世兰哲楪;

    .line 8
    .line 9
    return-void
.end method

.method public static final 飘花落叶言子世楪兰苏哲(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 13

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iget-boolean v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "visitSubtreeIf called on an unattached node"

    .line 11
    .line 12
    invoke-static {v1}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    new-instance v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 16
    .line 17
    const/16 v2, 0x10

    .line 18
    .line 19
    new-array v3, v2, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    invoke-direct {v1, v4, v3}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 26
    .line 27
    iget-object v3, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 28
    .line 29
    if-nez v3, :cond_1

    .line 30
    .line 31
    invoke-static {v1, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    invoke-virtual {v1, v3}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    :cond_2
    :goto_0
    iget v0, v1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 39
    .line 40
    if-eqz v0, :cond_e

    .line 41
    .line 42
    add-int/lit8 v0, v0, -0x1

    .line 43
    .line 44
    invoke-virtual {v1, v0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 49
    .line 50
    iget v3, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 51
    .line 52
    const/high16 v5, 0x40000

    .line 53
    .line 54
    and-int/2addr v3, v5

    .line 55
    if-eqz v3, :cond_d

    .line 56
    .line 57
    move-object v3, v0

    .line 58
    :goto_1
    if-eqz v3, :cond_d

    .line 59
    .line 60
    iget-boolean v6, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 61
    .line 62
    if-eqz v6, :cond_d

    .line 63
    .line 64
    iget v6, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 65
    .line 66
    and-int/2addr v6, v5

    .line 67
    if-eqz v6, :cond_c

    .line 68
    .line 69
    const/4 v6, 0x0

    .line 70
    move-object v7, v3

    .line 71
    move-object v8, v6

    .line 72
    :goto_2
    if-eqz v7, :cond_c

    .line 73
    .line 74
    instance-of v9, v7, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 75
    .line 76
    if-eqz v9, :cond_5

    .line 77
    .line 78
    check-cast v7, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 79
    .line 80
    invoke-interface {p0}, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-interface {v7}, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v10

    .line 88
    invoke-static {v9, v10}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v9

    .line 92
    if-eqz v9, :cond_3

    .line 93
    .line 94
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    move-result-object v10

    .line 102
    if-ne v9, v10, :cond_3

    .line 103
    .line 104
    invoke-interface {p1, v7}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v7

    .line 108
    check-cast v7, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    sget-object v7, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 112
    .line 113
    :goto_3
    sget-object v9, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->CancelTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 114
    .line 115
    if-ne v7, v9, :cond_4

    .line 116
    .line 117
    goto :goto_7

    .line 118
    :cond_4
    sget-object v9, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->SkipSubtreeAndContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 119
    .line 120
    if-eq v7, v9, :cond_2

    .line 121
    .line 122
    goto :goto_6

    .line 123
    :cond_5
    iget v9, v7, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 124
    .line 125
    and-int/2addr v9, v5

    .line 126
    if-eqz v9, :cond_b

    .line 127
    .line 128
    instance-of v9, v7, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 129
    .line 130
    if-eqz v9, :cond_b

    .line 131
    .line 132
    move-object v9, v7

    .line 133
    check-cast v9, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 134
    .line 135
    iget-object v9, v9, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 136
    .line 137
    move v10, v4

    .line 138
    :goto_4
    const/4 v11, 0x1

    .line 139
    if-eqz v9, :cond_a

    .line 140
    .line 141
    iget v12, v9, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 142
    .line 143
    and-int/2addr v12, v5

    .line 144
    if-eqz v12, :cond_9

    .line 145
    .line 146
    add-int/lit8 v10, v10, 0x1

    .line 147
    .line 148
    if-ne v10, v11, :cond_6

    .line 149
    .line 150
    move-object v7, v9

    .line 151
    goto :goto_5

    .line 152
    :cond_6
    if-nez v8, :cond_7

    .line 153
    .line 154
    new-instance v8, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 155
    .line 156
    new-array v11, v2, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 157
    .line 158
    invoke-direct {v8, v4, v11}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    :cond_7
    if-eqz v7, :cond_8

    .line 162
    .line 163
    invoke-virtual {v8, v7}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    move-object v7, v6

    .line 167
    :cond_8
    invoke-virtual {v8, v9}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    :cond_9
    :goto_5
    iget-object v9, v9, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 171
    .line 172
    goto :goto_4

    .line 173
    :cond_a
    if-ne v10, v11, :cond_b

    .line 174
    .line 175
    goto :goto_2

    .line 176
    :cond_b
    :goto_6
    invoke-static {v8}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    goto :goto_2

    .line 181
    :cond_c
    iget-object v3, v3, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_d
    invoke-static {v1, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V

    .line 185
    .line 186
    .line 187
    goto/16 :goto_0

    .line 188
    .line 189
    :cond_e
    :goto_7
    return-void
.end method

.method public static final 飘花落叶言子世楪哲兰苏(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;Ljava/lang/String;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 12

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitSubtreeIf called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    new-instance v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 13
    .line 14
    const/16 v1, 0x10

    .line 15
    .line 16
    new-array v2, v1, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-direct {v0, v3, v2}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 23
    .line 24
    iget-object v2, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 25
    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    invoke-static {v0, p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    iget p0, v0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 36
    .line 37
    if-eqz p0, :cond_e

    .line 38
    .line 39
    add-int/lit8 p0, p0, -0x1

    .line 40
    .line 41
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 46
    .line 47
    iget v2, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 48
    .line 49
    const/high16 v4, 0x40000

    .line 50
    .line 51
    and-int/2addr v2, v4

    .line 52
    if-eqz v2, :cond_d

    .line 53
    .line 54
    move-object v2, p0

    .line 55
    :goto_1
    if-eqz v2, :cond_d

    .line 56
    .line 57
    iget-boolean v5, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 58
    .line 59
    if-eqz v5, :cond_d

    .line 60
    .line 61
    iget v5, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 62
    .line 63
    and-int/2addr v5, v4

    .line 64
    if-eqz v5, :cond_c

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    move-object v6, v2

    .line 68
    move-object v7, v5

    .line 69
    :goto_2
    if-eqz v6, :cond_c

    .line 70
    .line 71
    instance-of v8, v6, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 72
    .line 73
    if-eqz v8, :cond_5

    .line 74
    .line 75
    check-cast v6, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 76
    .line 77
    invoke-interface {v6}, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-virtual {p1, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v8

    .line 85
    if-eqz v8, :cond_3

    .line 86
    .line 87
    invoke-interface {p2, v6}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    check-cast v6, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    sget-object v6, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->ContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 95
    .line 96
    :goto_3
    sget-object v8, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->CancelTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 97
    .line 98
    if-ne v6, v8, :cond_4

    .line 99
    .line 100
    goto :goto_7

    .line 101
    :cond_4
    sget-object v8, Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;->SkipSubtreeAndContinueTraversal:Landroidx/compose/ui/node/TraversableNode$Companion$TraverseDescendantsAction;

    .line 102
    .line 103
    if-eq v6, v8, :cond_2

    .line 104
    .line 105
    goto :goto_6

    .line 106
    :cond_5
    iget v8, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 107
    .line 108
    and-int/2addr v8, v4

    .line 109
    if-eqz v8, :cond_b

    .line 110
    .line 111
    instance-of v8, v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 112
    .line 113
    if-eqz v8, :cond_b

    .line 114
    .line 115
    move-object v8, v6

    .line 116
    check-cast v8, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 117
    .line 118
    iget-object v8, v8, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 119
    .line 120
    move v9, v3

    .line 121
    :goto_4
    const/4 v10, 0x1

    .line 122
    if-eqz v8, :cond_a

    .line 123
    .line 124
    iget v11, v8, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 125
    .line 126
    and-int/2addr v11, v4

    .line 127
    if-eqz v11, :cond_9

    .line 128
    .line 129
    add-int/lit8 v9, v9, 0x1

    .line 130
    .line 131
    if-ne v9, v10, :cond_6

    .line 132
    .line 133
    move-object v6, v8

    .line 134
    goto :goto_5

    .line 135
    :cond_6
    if-nez v7, :cond_7

    .line 136
    .line 137
    new-instance v7, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 138
    .line 139
    new-array v10, v1, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 140
    .line 141
    invoke-direct {v7, v3, v10}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    :cond_7
    if-eqz v6, :cond_8

    .line 145
    .line 146
    invoke-virtual {v7, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    move-object v6, v5

    .line 150
    :cond_8
    invoke-virtual {v7, v8}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 151
    .line 152
    .line 153
    :cond_9
    :goto_5
    iget-object v8, v8, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 154
    .line 155
    goto :goto_4

    .line 156
    :cond_a
    if-ne v9, v10, :cond_b

    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_b
    :goto_6
    invoke-static {v7}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 160
    .line 161
    .line 162
    move-result-object v6

    .line 163
    goto :goto_2

    .line 164
    :cond_c
    iget-object v2, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_d
    invoke-static {v0, p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V

    .line 168
    .line 169
    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_e
    :goto_7
    return-void
.end method

.method public static final 飘花落叶言子世楪哲苏兰(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 11

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iget-boolean v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    invoke-static {v1}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 16
    .line 17
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 18
    .line 19
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    :goto_0
    if-eqz v1, :cond_c

    .line 24
    .line 25
    iget-object v2, v1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 26
    .line 27
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 28
    .line 29
    iget v2, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 30
    .line 31
    const/high16 v3, 0x40000

    .line 32
    .line 33
    and-int/2addr v2, v3

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_a

    .line 36
    .line 37
    :goto_1
    if-eqz v0, :cond_a

    .line 38
    .line 39
    iget v2, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 40
    .line 41
    and-int/2addr v2, v3

    .line 42
    if-eqz v2, :cond_9

    .line 43
    .line 44
    move-object v2, v0

    .line 45
    move-object v5, v4

    .line 46
    :goto_2
    if-eqz v2, :cond_9

    .line 47
    .line 48
    instance-of v6, v2, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 49
    .line 50
    const/4 v7, 0x1

    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    check-cast v2, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 54
    .line 55
    invoke-interface {p0}, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-interface {v2}, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v8

    .line 63
    invoke-static {v6, v8}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    if-eqz v6, :cond_1

    .line 68
    .line 69
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v8

    .line 77
    if-ne v6, v8, :cond_1

    .line 78
    .line 79
    invoke-interface {p1, v2}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    :cond_1
    if-nez v7, :cond_8

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_2
    iget v6, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 93
    .line 94
    and-int/2addr v6, v3

    .line 95
    if-eqz v6, :cond_8

    .line 96
    .line 97
    instance-of v6, v2, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 98
    .line 99
    if-eqz v6, :cond_8

    .line 100
    .line 101
    move-object v6, v2

    .line 102
    check-cast v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 103
    .line 104
    iget-object v6, v6, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 105
    .line 106
    const/4 v8, 0x0

    .line 107
    move v9, v8

    .line 108
    :goto_3
    if-eqz v6, :cond_7

    .line 109
    .line 110
    iget v10, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 111
    .line 112
    and-int/2addr v10, v3

    .line 113
    if-eqz v10, :cond_6

    .line 114
    .line 115
    add-int/lit8 v9, v9, 0x1

    .line 116
    .line 117
    if-ne v9, v7, :cond_3

    .line 118
    .line 119
    move-object v2, v6

    .line 120
    goto :goto_4

    .line 121
    :cond_3
    if-nez v5, :cond_4

    .line 122
    .line 123
    new-instance v5, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 124
    .line 125
    const/16 v10, 0x10

    .line 126
    .line 127
    new-array v10, v10, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 128
    .line 129
    invoke-direct {v5, v8, v10}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    if-eqz v2, :cond_5

    .line 133
    .line 134
    invoke-virtual {v5, v2}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    move-object v2, v4

    .line 138
    :cond_5
    invoke-virtual {v5, v6}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_6
    :goto_4
    iget-object v6, v6, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_7
    if-ne v9, v7, :cond_8

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_8
    invoke-static {v5}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    goto :goto_2

    .line 152
    :cond_9
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_a
    invoke-virtual {v1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    if-eqz v1, :cond_b

    .line 160
    .line 161
    iget-object v0, v1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 162
    .line 163
    if-eqz v0, :cond_b

    .line 164
    .line 165
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_b
    move-object v0, v4

    .line 170
    goto/16 :goto_0

    .line 171
    .line 172
    :cond_c
    :goto_5
    return-void
.end method

.method public static final 飘花落叶言子世楪苏兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 10

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
    const-string v0, "visitAncestors called on an unattached node"

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    move-object v0, p0

    .line 16
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 17
    .line 18
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 21
    .line 22
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    :goto_0
    if-eqz p0, :cond_c

    .line 27
    .line 28
    iget-object v1, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 29
    .line 30
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 31
    .line 32
    iget v1, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 33
    .line 34
    const/high16 v2, 0x40000

    .line 35
    .line 36
    and-int/2addr v1, v2

    .line 37
    const/4 v3, 0x0

    .line 38
    if-eqz v1, :cond_a

    .line 39
    .line 40
    :goto_1
    if-eqz v0, :cond_a

    .line 41
    .line 42
    iget v1, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 43
    .line 44
    and-int/2addr v1, v2

    .line 45
    if-eqz v1, :cond_9

    .line 46
    .line 47
    move-object v1, v0

    .line 48
    move-object v4, v3

    .line 49
    :goto_2
    if-eqz v1, :cond_9

    .line 50
    .line 51
    instance-of v5, v1, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    check-cast v1, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 57
    .line 58
    invoke-interface {v1}, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {p1, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-eqz v5, :cond_1

    .line 67
    .line 68
    invoke-interface {p2, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    :cond_1
    if-nez v6, :cond_8

    .line 79
    .line 80
    goto :goto_5

    .line 81
    :cond_2
    iget v5, v1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 82
    .line 83
    and-int/2addr v5, v2

    .line 84
    if-eqz v5, :cond_8

    .line 85
    .line 86
    instance-of v5, v1, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 87
    .line 88
    if-eqz v5, :cond_8

    .line 89
    .line 90
    move-object v5, v1

    .line 91
    check-cast v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 92
    .line 93
    iget-object v5, v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 94
    .line 95
    const/4 v7, 0x0

    .line 96
    move v8, v7

    .line 97
    :goto_3
    if-eqz v5, :cond_7

    .line 98
    .line 99
    iget v9, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 100
    .line 101
    and-int/2addr v9, v2

    .line 102
    if-eqz v9, :cond_6

    .line 103
    .line 104
    add-int/lit8 v8, v8, 0x1

    .line 105
    .line 106
    if-ne v8, v6, :cond_3

    .line 107
    .line 108
    move-object v1, v5

    .line 109
    goto :goto_4

    .line 110
    :cond_3
    if-nez v4, :cond_4

    .line 111
    .line 112
    new-instance v4, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 113
    .line 114
    const/16 v9, 0x10

    .line 115
    .line 116
    new-array v9, v9, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 117
    .line 118
    invoke-direct {v4, v7, v9}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_4
    if-eqz v1, :cond_5

    .line 122
    .line 123
    invoke-virtual {v4, v1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    move-object v1, v3

    .line 127
    :cond_5
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    :goto_4
    iget-object v5, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_7
    if-ne v8, v6, :cond_8

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    invoke-static {v4}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    goto :goto_2

    .line 141
    :cond_9
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_a
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    if-eqz p0, :cond_b

    .line 149
    .line 150
    iget-object v0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 151
    .line 152
    if-eqz v0, :cond_b

    .line 153
    .line 154
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 155
    .line 156
    goto/16 :goto_0

    .line 157
    .line 158
    :cond_b
    move-object v0, v3

    .line 159
    goto/16 :goto_0

    .line 160
    .line 161
    :cond_c
    :goto_5
    return-void
.end method

.method public static final 飘花落叶言子世楪苏哲兰(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroid/view/View;
    .locals 1

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
    const-string v0, "Cannot get View because the Modifier node is not currently attached."

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    check-cast p0, Landroid/view/View;

    .line 24
    .line 25
    return-object p0
.end method

.method public static final 飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;
    .locals 2

    .line 1
    iget v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_3

    .line 7
    .line 8
    instance-of v0, p0, Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast p0, Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    instance-of v0, p0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    check-cast p0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 20
    .line 21
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 22
    .line 23
    :goto_0
    if-eqz p0, :cond_3

    .line 24
    .line 25
    instance-of v0, p0, Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;

    .line 26
    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    check-cast p0, Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_1
    instance-of v0, p0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    iget v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 37
    .line 38
    and-int/lit8 v0, v0, 0x2

    .line 39
    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    check-cast p0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 43
    .line 44
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_3
    return-object v1
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget v0, p0, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏兰世哲(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
    .locals 2

    .line 1
    check-cast p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 11
    .line 12
    and-int/2addr v0, p1

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    :goto_0
    if-eqz p0, :cond_4

    .line 17
    .line 18
    iget v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 19
    .line 20
    and-int/lit8 v1, v0, 0x2

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    and-int/2addr v0, p1

    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_3
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public static final 飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;Landroidx/compose/ui/layout/飘花落叶言子楪世苏哲兰;)I
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲楪世兰苏()Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v2, "Child of "

    .line 11
    .line 12
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v2, " cannot be null when calculating alignment line"

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲世楪苏兰()Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-interface {v1}, Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲苏兰()Ljava/util/Map;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/high16 v2, -0x80000000

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲世楪苏兰()Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-interface {p0}, Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;->飘花落叶言子楪世哲苏兰()Ljava/util/Map;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/lang/Integer;

    .line 59
    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    return p0

    .line 67
    :cond_1
    invoke-virtual {v0, p1}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲楪世苏兰(Landroidx/compose/ui/layout/飘花落叶言子楪世苏哲兰;)I

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-ne v1, v2, :cond_3

    .line 72
    .line 73
    :cond_2
    return v2

    .line 74
    :cond_3
    const/4 v2, 0x1

    .line 75
    iput-boolean v2, v0, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰:Z

    .line 76
    .line 77
    iput-boolean v2, p0, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏兰哲:Z

    .line 78
    .line 79
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲苏楪世兰()V

    .line 80
    .line 81
    .line 82
    const/4 v2, 0x0

    .line 83
    iput-boolean v2, v0, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰:Z

    .line 84
    .line 85
    iput-boolean v2, p0, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏兰哲:Z

    .line 86
    .line 87
    instance-of p0, p1, Landroidx/compose/ui/layout/飘花落叶言子楪哲世苏兰;

    .line 88
    .line 89
    if-eqz p0, :cond_4

    .line 90
    .line 91
    invoke-virtual {v0}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲世苏楪兰()J

    .line 92
    .line 93
    .line 94
    move-result-wide p0

    .line 95
    const-wide v2, 0xffffffffL

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    and-long/2addr p0, v2

    .line 101
    :goto_1
    long-to-int p0, p0

    .line 102
    add-int/2addr v1, p0

    .line 103
    return v1

    .line 104
    :cond_4
    invoke-virtual {v0}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲世苏楪兰()J

    .line 105
    .line 106
    .line 107
    move-result-wide p0

    .line 108
    const/16 v0, 0x20

    .line 109
    .line 110
    shr-long/2addr p0, v0

    .line 111
    goto :goto_1
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪苏兰哲()Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget v0, p1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 10
    .line 11
    add-int/lit8 v0, v0, -0x1

    .line 12
    .line 13
    iget-object p1, p1, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世:[Ljava/lang/Object;

    .line 14
    .line 15
    array-length v1, p1

    .line 16
    if-ge v0, v1, :cond_0

    .line 17
    .line 18
    :goto_0
    if-ltz v0, :cond_0

    .line 19
    .line 20
    aget-object v1, p1, v0

    .line 21
    .line 22
    check-cast v1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 23
    .line 24
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 25
    .line 26
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    add-int/lit8 v0, v0, -0x1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(FZZ)J
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    int-to-long v0, p0

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const-wide/16 p0, 0x1

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-wide p0, v2

    .line 14
    :goto_0
    if-eqz p2, :cond_1

    .line 15
    .line 16
    const-wide/16 v2, 0x2

    .line 17
    .line 18
    :cond_1
    or-long/2addr p0, v2

    .line 19
    const/16 p2, 0x20

    .line 20
    .line 21
    shl-long/2addr v0, p2

    .line 22
    const-wide v2, 0xffffffffL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    and-long/2addr p0, v2

    .line 28
    or-long/2addr p0, v0

    .line 29
    return-wide p0
.end method

.method public static final 飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Landroidx/compose/ui/node/飘花落叶言子苏世兰楪哲;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroidx/compose/ui/node/飘花落叶言子苏世兰楪哲;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Landroidx/compose/ui/node/飘花落叶言子苏世哲兰楪;

    .line 9
    .line 10
    invoke-direct {v0, v1}, Landroidx/compose/ui/node/飘花落叶言子苏世兰楪哲;-><init>(Landroidx/compose/ui/node/飘花落叶言子苏世哲兰楪;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏哲世:Landroidx/compose/ui/node/飘花落叶言子苏世兰楪哲;

    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;->getSnapshotObserver()Landroidx/compose/ui/node/飘花落叶言子苏哲兰世楪;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    sget-object v1, Landroidx/compose/ui/node/飘花落叶言子苏世兰楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 26
    .line 27
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;

    .line 28
    .line 29
    invoke-virtual {p0, v0, v1, p1}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰哲世苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static final 飘花落叶言子楪兰世苏哲(Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰哲苏世:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世哲兰:Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;

    .line 18
    .line 19
    iget-boolean p0, p0, Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Z

    .line 20
    .line 21
    if-eqz p0, :cond_2

    .line 22
    .line 23
    :cond_1
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_2
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public static final 飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;
    .locals 0

    .line 1
    check-cast p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, "Cannot obtain node coordinator. Is the Modifier.Node attached?"

    .line 13
    .line 14
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    throw p0
.end method

.method public static final 飘花落叶言子楪兰哲苏世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/node/飘花落叶言子苏哲世兰楪;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "This node does not have an owner."

    .line 11
    .line 12
    invoke-static {p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子世楪苏兰哲(Ljava/lang/String;)Lkotlin/KotlinNothingValueException;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    throw p0
.end method

.method public static final 飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;
    .locals 2

    .line 1
    move-object v0, p0

    .line 2
    check-cast v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 3
    .line 4
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 5
    .line 6
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰哲世苏:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子兰楪世苏哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eq v1, p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1}, Landroidx/compose/ui/node/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏世哲兰(I)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    iget-object p0, v0, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏哲楪兰:Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    :goto_0
    return-object v0
.end method

.method public static final 飘花落叶言子楪兰苏哲世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;
    .locals 1

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
    const-string v0, "Cannot get LayoutCoordinates, Modifier.Node is not attached."

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    const/4 v0, 0x2

    .line 16
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子兰楪世苏哲()Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 25
    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const-string v0, "LayoutCoordinates is not attached."

    .line 29
    .line 30
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏楪哲兰()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final 飘花落叶言子楪哲世苏兰(Landroidx/compose/ui/node/飘花落叶言子楪哲苏世兰;)V
    .locals 1

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
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const/4 v0, 0x1

    .line 11
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子兰世楪哲苏()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static final 飘花落叶言子楪哲兰世苏(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x1

    .line 2
    .line 3
    and-long/2addr p0, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final 飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏楪世哲兰:Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏:Landroidx/compose/ui/node/LayoutNode$LayoutState;

    .line 4
    .line 5
    sget-object v1, Landroidx/compose/ui/node/飘花落叶言子世兰苏楪哲;->飘花落叶言子楪世苏哲兰:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_3

    .line 15
    .line 16
    const/4 v2, 0x2

    .line 17
    if-eq v0, v2, :cond_3

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_2

    .line 25
    .line 26
    const/4 v1, 0x5

    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)Z

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_0
    const-string p0, "no parent for idle node"

    .line 41
    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    return v2

    .line 46
    :cond_1
    invoke-static {}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲兰世苏()V

    .line 47
    .line 48
    .line 49
    :cond_2
    return v2

    .line 50
    :cond_3
    return v1
.end method

.method public static final 飘花落叶言子楪哲苏世兰(Landroidx/compose/ui/node/飘花落叶言子哲楪世苏兰;)V
    .locals 0

    .line 1
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世苏楪兰哲()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static final 飘花落叶言子楪哲苏兰世(J)Z
    .locals 2

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    and-long/2addr p0, v0

    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    cmp-long p0, p0, v0

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0
.end method

.method public static final 飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;
    .locals 1

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
    const-string v0, "Cannot read CompositionLocal because the Modifier node is not currently attached."

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰楪哲苏:Landroidx/compose/runtime/飘花落叶言子楪哲兰苏世;

    .line 20
    .line 21
    check-cast p0, Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p0, p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏哲楪兰(Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏世哲兰(JJ)I
    .locals 5

    .line 1
    invoke-static {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {p2, p3}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰世苏(J)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v3, -0x1

    .line 11
    if-eq v0, v1, :cond_1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    return v3

    .line 16
    :cond_0
    return v2

    .line 17
    :cond_1
    invoke-static {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(J)F

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {p2, p3}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(J)F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    sub-float/2addr v0, v1

    .line 26
    invoke-static {v0}, Ljava/lang/Math;->signum(F)F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    float-to-int v0, v0

    .line 31
    invoke-static {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(J)F

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-static {p2, p3}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏兰哲世(J)F

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    invoke-static {v1, v4}, Ljava/lang/Math;->min(FF)F

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/4 v4, 0x0

    .line 44
    cmpg-float v1, v1, v4

    .line 45
    .line 46
    if-gez v1, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-static {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世(J)Z

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {p2, p3}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世(J)Z

    .line 54
    .line 55
    .line 56
    move-result p2

    .line 57
    if-eq v1, p2, :cond_4

    .line 58
    .line 59
    invoke-static {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲苏兰世(J)Z

    .line 60
    .line 61
    .line 62
    move-result p0

    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    return v3

    .line 66
    :cond_3
    return v2

    .line 67
    :cond_4
    :goto_0
    return v0
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/layout/飘花落叶言子楪哲兰苏世;)Ljava/util/ArrayList;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    check-cast p0, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世苏兰哲楪;->飘花落叶言子哲楪兰世苏()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪哲兰苏世(Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲苏世兰()Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance v1, Ljava/util/ArrayList;

    .line 19
    .line 20
    check-cast p0, Landroidx/collection/飘花落叶言子世哲楪苏兰;

    .line 21
    .line 22
    iget-object v2, p0, Landroidx/collection/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v2, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 25
    .line 26
    iget v3, v2, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 27
    .line 28
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 29
    .line 30
    .line 31
    iget v2, v2, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰苏世:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    :goto_0
    if-ge v3, v2, :cond_1

    .line 35
    .line 36
    invoke-virtual {p0, v3}, Landroidx/collection/飘花落叶言子世哲楪苏兰;->get(I)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    check-cast v4, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 41
    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    invoke-virtual {v4}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪苏兰哲世()Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    goto :goto_1

    .line 49
    :cond_0
    invoke-virtual {v4}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪哲世苏兰()Ljava/util/List;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    :goto_1
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    add-int/lit8 v3, v3, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    return-object v1
.end method

.method public static final 飘花落叶言子楪苏兰哲世(J)F
    .locals 1

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long/2addr p0, v0

    .line 4
    long-to-int p0, p0

    .line 5
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;ZZ)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    sget-object p0, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲:L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 8
    .line 9
    return-object p0

    .line 10
    :cond_0
    const/16 v0, 0x8

    .line 11
    .line 12
    if-nez p1, :cond_1

    .line 13
    .line 14
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-interface {p1, p0, p2}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;Z)L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子兰哲世苏楪()L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世哲苏兰;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;Ljava/lang/Object;)Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 2
    .line 3
    iget-boolean v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "visitAncestors called on an unattached node"

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言子苏楪世兰哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 13
    .line 14
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 15
    .line 16
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    :goto_0
    const/4 v1, 0x0

    .line 21
    if-eqz p0, :cond_b

    .line 22
    .line 23
    iget-object v2, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 24
    .line 25
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 26
    .line 27
    iget v2, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世苏哲:I

    .line 28
    .line 29
    const/high16 v3, 0x40000

    .line 30
    .line 31
    and-int/2addr v2, v3

    .line 32
    if-eqz v2, :cond_9

    .line 33
    .line 34
    :goto_1
    if-eqz v0, :cond_9

    .line 35
    .line 36
    iget v2, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 37
    .line 38
    and-int/2addr v2, v3

    .line 39
    if-eqz v2, :cond_8

    .line 40
    .line 41
    move-object v2, v0

    .line 42
    move-object v4, v1

    .line 43
    :goto_2
    if-eqz v2, :cond_8

    .line 44
    .line 45
    instance-of v5, v2, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 46
    .line 47
    if-eqz v5, :cond_1

    .line 48
    .line 49
    move-object v5, v2

    .line 50
    check-cast v5, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;

    .line 51
    .line 52
    invoke-interface {v5}, Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;->飘花落叶言子楪哲苏世兰()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    invoke-virtual {p1, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_1

    .line 61
    .line 62
    return-object v5

    .line 63
    :cond_1
    iget v5, v2, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 64
    .line 65
    and-int/2addr v5, v3

    .line 66
    if-eqz v5, :cond_7

    .line 67
    .line 68
    instance-of v5, v2, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 69
    .line 70
    if-eqz v5, :cond_7

    .line 71
    .line 72
    move-object v5, v2

    .line 73
    check-cast v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;

    .line 74
    .line 75
    iget-object v5, v5, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 76
    .line 77
    const/4 v6, 0x0

    .line 78
    move v7, v6

    .line 79
    :goto_3
    const/4 v8, 0x1

    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    iget v9, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪哲兰苏世:I

    .line 83
    .line 84
    and-int/2addr v9, v3

    .line 85
    if-eqz v9, :cond_5

    .line 86
    .line 87
    add-int/lit8 v7, v7, 0x1

    .line 88
    .line 89
    if-ne v7, v8, :cond_2

    .line 90
    .line 91
    move-object v2, v5

    .line 92
    goto :goto_4

    .line 93
    :cond_2
    if-nez v4, :cond_3

    .line 94
    .line 95
    new-instance v4, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;

    .line 96
    .line 97
    const/16 v8, 0x10

    .line 98
    .line 99
    new-array v8, v8, [Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 100
    .line 101
    invoke-direct {v4, v6, v8}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;-><init>(I[Ljava/lang/Object;)V

    .line 102
    .line 103
    .line 104
    :cond_3
    if-eqz v2, :cond_4

    .line 105
    .line 106
    invoke-virtual {v4, v2}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    move-object v2, v1

    .line 110
    :cond_4
    invoke-virtual {v4, v5}, Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    :cond_5
    :goto_4
    iget-object v5, v5, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰苏世哲:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    if-ne v7, v8, :cond_7

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_7
    invoke-static {v4}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/runtime/collection/飘花落叶言子楪世苏兰哲;)Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    goto :goto_2

    .line 124
    :cond_8
    iget-object v0, v0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;

    .line 125
    .line 126
    goto :goto_1

    .line 127
    :cond_9
    invoke-virtual {p0}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪兰苏哲世()Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-eqz p0, :cond_a

    .line 132
    .line 133
    iget-object v0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 134
    .line 135
    if-eqz v0, :cond_a

    .line 136
    .line 137
    iget-object v0, v0, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_a
    move-object v0, v1

    .line 141
    goto :goto_0

    .line 142
    :cond_b
    return-object v1
.end method
