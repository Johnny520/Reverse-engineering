.class public final Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

.field public 飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

.field public 飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public 飘花落叶言子楪世苏哲兰:Z


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;[Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p2, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 9
    .line 10
    const/4 p3, 0x0

    .line 11
    iput-object p3, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 12
    .line 13
    array-length p2, p2

    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public 飘花落叶言子楪世兰苏哲(II)V
    .locals 2

    .line 1
    int-to-float v0, p1

    .line 2
    const/4 v1, 0x0

    .line 3
    cmpl-float v0, v0, v1

    .line 4
    .line 5
    if-ltz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string v1, "Index should be non-negative ("

    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const/16 v1, 0x29

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object v0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 33
    .line 34
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪苏兰哲世(I)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪兰哲苏;

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世楪兰哲苏;->飘花落叶言子楪世苏哲兰(I)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 49
    .line 50
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;

    .line 51
    .line 52
    invoke-virtual {p0, p2}, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪苏兰哲世(I)V

    .line 53
    .line 54
    .line 55
    return-void
.end method

.method public 飘花落叶言子楪世哲兰苏(Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;Z)I
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲兰苏;

    .line 6
    .line 7
    iget-object v2, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, Landroidx/compose/ui/node/飘花落叶言子楪哲兰苏世;

    .line 10
    .line 11
    iget-boolean v3, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    return v4

    .line 17
    :cond_0
    const/4 v3, 0x1

    .line 18
    :try_start_0
    iput-boolean v3, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 19
    .line 20
    iget-object v5, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 23
    .line 24
    move-object/from16 v6, p1

    .line 25
    .line 26
    move-object/from16 v7, p2

    .line 27
    .line 28
    invoke-virtual {v5, v6, v7}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子世楪兰哲苏(Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;Landroidx/compose/ui/platform/飘花落叶言子楪兰世苏哲;)L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    iget-object v6, v5, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v6, Landroidx/collection/飘花落叶言子楪兰世哲苏;

    .line 35
    .line 36
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲()I

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    move v8, v4

    .line 41
    :goto_0
    if-ge v8, v7, :cond_3

    .line 42
    .line 43
    invoke-virtual {v6, v8}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    check-cast v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 48
    .line 49
    iget-boolean v10, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲兰苏:Z

    .line 50
    .line 51
    if-nez v10, :cond_2

    .line 52
    .line 53
    iget-boolean v9, v9, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Z

    .line 54
    .line 55
    if-eqz v9, :cond_1

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    add-int/lit8 v8, v8, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_8

    .line 63
    .line 64
    :cond_2
    :goto_1
    move v7, v4

    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move v7, v3

    .line 67
    :goto_2
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲()I

    .line 68
    .line 69
    .line 70
    move-result v8

    .line 71
    move v9, v4

    .line 72
    :goto_3
    if-ge v9, v8, :cond_6

    .line 73
    .line 74
    invoke-virtual {v6, v9}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v10

    .line 78
    check-cast v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 79
    .line 80
    if-nez v7, :cond_4

    .line 81
    .line 82
    invoke-static {v10}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    if-eqz v11, :cond_5

    .line 87
    .line 88
    :cond_4
    iget-object v11, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    check-cast v12, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 92
    .line 93
    iget-wide v13, v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰:J

    .line 94
    .line 95
    iget-object v11, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 96
    .line 97
    move-object v15, v11

    .line 98
    check-cast v15, Landroidx/compose/ui/node/飘花落叶言子楪哲兰苏世;

    .line 99
    .line 100
    iget v11, v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:I

    .line 101
    .line 102
    sget-object v16, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏世兰哲楪:Landroidx/compose/ui/node/飘花落叶言子世楪哲苏兰;

    .line 103
    .line 104
    const/16 v17, 0x1

    .line 105
    .line 106
    move/from16 v16, v11

    .line 107
    .line 108
    invoke-virtual/range {v12 .. v17}, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世楪哲苏兰(JLandroidx/compose/ui/node/飘花落叶言子楪哲兰苏世;IZ)V

    .line 109
    .line 110
    .line 111
    iget-object v11, v2, Landroidx/compose/ui/node/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲苏兰世:Landroidx/collection/飘花落叶言子世哲苏楪兰;

    .line 112
    .line 113
    invoke-virtual {v11}, Landroidx/collection/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世哲兰苏()Z

    .line 114
    .line 115
    .line 116
    move-result v11

    .line 117
    if-nez v11, :cond_5

    .line 118
    .line 119
    iget-wide v11, v10, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世苏哲兰:J

    .line 120
    .line 121
    invoke-static {v10}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;)Z

    .line 122
    .line 123
    .line 124
    move-result v10

    .line 125
    invoke-virtual {v0, v11, v12, v2, v10}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(JLjava/util/List;Z)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Landroidx/compose/ui/node/飘花落叶言子楪哲兰苏世;->clear()V

    .line 129
    .line 130
    .line 131
    :cond_5
    add-int/lit8 v9, v9, 0x1

    .line 132
    .line 133
    goto :goto_3

    .line 134
    :cond_6
    move/from16 v2, p3

    .line 135
    .line 136
    invoke-virtual {v0, v5, v2}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;Z)Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    iget-boolean v2, v5, L飘花落叶言楪世苏兰哲子/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:Z

    .line 141
    .line 142
    if-eqz v2, :cond_8

    .line 143
    .line 144
    :cond_7
    move v2, v4

    .line 145
    goto :goto_5

    .line 146
    :cond_8
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    move v5, v4

    .line 151
    :goto_4
    if-ge v5, v2, :cond_7

    .line 152
    .line 153
    invoke-virtual {v6, v5}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    check-cast v7, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 158
    .line 159
    invoke-static {v7, v3}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏世兰哲(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;Z)J

    .line 160
    .line 161
    .line 162
    move-result-wide v8

    .line 163
    const-wide/16 v10, 0x0

    .line 164
    .line 165
    invoke-static {v8, v9, v10, v11}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(JJ)Z

    .line 166
    .line 167
    .line 168
    move-result v8

    .line 169
    if-nez v8, :cond_9

    .line 170
    .line 171
    invoke-virtual {v7}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-eqz v7, :cond_9

    .line 176
    .line 177
    move v2, v3

    .line 178
    goto :goto_5

    .line 179
    :cond_9
    add-int/lit8 v5, v5, 0x1

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :goto_5
    invoke-virtual {v6}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏世兰哲()I

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    move v7, v4

    .line 187
    :goto_6
    if-ge v7, v5, :cond_b

    .line 188
    .line 189
    invoke-virtual {v6, v7}, Landroidx/collection/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪苏哲世兰(I)Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    check-cast v8, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 194
    .line 195
    invoke-virtual {v8}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪世哲苏兰()Z

    .line 196
    .line 197
    .line 198
    move-result v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 199
    if-eqz v8, :cond_a

    .line 200
    .line 201
    move v5, v3

    .line 202
    goto :goto_7

    .line 203
    :cond_a
    add-int/lit8 v7, v7, 0x1

    .line 204
    .line 205
    goto :goto_6

    .line 206
    :cond_b
    move v5, v4

    .line 207
    :goto_7
    shl-int/2addr v2, v3

    .line 208
    or-int/2addr v0, v2

    .line 209
    shl-int/lit8 v2, v5, 0x2

    .line 210
    .line 211
    or-int/2addr v0, v2

    .line 212
    iput-boolean v4, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 213
    .line 214
    return v0

    .line 215
    :goto_8
    iput-boolean v4, v1, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰:Z

    .line 216
    .line 217
    throw v0
.end method

.method public 飘花落叶言子楪世哲苏兰()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 4
    .line 5
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪苏兰世哲()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public 飘花落叶言子楪世苏兰哲()Ljava/lang/String;
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲兰苏:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/String;

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    iget-object v2, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世哲苏兰:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, [Ljava/lang/Object;

    .line 18
    .line 19
    array-length v4, v3

    .line 20
    if-lez v4, :cond_1

    .line 21
    .line 22
    invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    const-string v2, "; "

    .line 29
    .line 30
    invoke-static {v1, v2}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_0
    iput-object v1, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 46
    .line 47
    :cond_1
    return-object v1
.end method

.method public 飘花落叶言子楪世苏哲兰()I
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/lazy/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子苏楪哲兰世;

    .line 4
    .line 5
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/compose/runtime/飘花落叶言子哲苏世楪兰;->飘花落叶言子楪苏兰世哲()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
