.class public final Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;
.super Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子楪哲苏世兰;


# instance fields
.field public 飘花落叶言子世苏兰楪哲:Ljava/lang/Object;

.field public final 飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;

.field public final 飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;

.field public final synthetic 飘花落叶言子世苏楪兰哲:I


# direct methods
.method public constructor <init>(Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏楪兰哲:I

    .line 17
    invoke-direct {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 18
    iput-object p2, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;

    .line 19
    iput-object p3, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;

    .line 20
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子哲兰世苏楪(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;

    return-void
.end method

.method public constructor <init>(Landroidx/compose/ui/input/pointer/飘花落叶言子世苏楪兰哲;Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;Landroidx/compose/foundation/layout/飘花落叶言子苏哲世楪兰;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏楪兰哲:I

    .line 3
    .line 4
    invoke-direct {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    iput-object p3, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;

    .line 10
    .line 11
    iput-object p4, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏兰楪哲:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroidx/compose/ui/node/飘花落叶言子楪苏哲兰世;->飘花落叶言子哲兰世苏楪(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public static 飘花落叶言子兰楪世哲苏(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 3

    .line 1
    invoke-virtual {p4}, Landroid/graphics/Canvas;->save()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p4, p0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 6
    .line 7
    .line 8
    const/16 p0, 0x20

    .line 9
    .line 10
    shr-long v1, p1, p0

    .line 11
    .line 12
    long-to-int p0, v1

    .line 13
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const-wide v1, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    and-long/2addr p1, v1

    .line 23
    long-to-int p1, p1

    .line 24
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-virtual {p4, p0, p1}, Landroid/graphics/Canvas;->translate(FF)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p3, p4}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-virtual {p4, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 36
    .line 37
    .line 38
    return p0
.end method

.method public static 飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    cmpg-float v0, p0, v0

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    invoke-virtual {p2, p0}, Landroid/graphics/Canvas;->rotate(F)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p2, v0}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 23
    .line 24
    .line 25
    return p0
.end method


# virtual methods
.method public 飘花落叶言子兰楪苏世哲()Landroid/graphics/RenderNode;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏兰楪哲:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/RenderNode;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-static {}, Landroidx/activity/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲苏兰()Landroid/graphics/RenderNode;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iput-object v0, p0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏兰楪哲:Ljava/lang/Object;

    .line 12
    .line 13
    :cond_0
    return-object v0
.end method

.method public final 飘花落叶言子苏兰楪世哲(Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世哲苏兰;)V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget v2, v0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏楪兰哲:I

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏哲楪兰:Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;

    .line 8
    .line 9
    iget-object v7, v0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏哲兰楪:Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;

    .line 10
    .line 11
    const/high16 v11, 0x42b40000    # 90.0f

    .line 12
    .line 13
    const/high16 v12, 0x43870000    # 270.0f

    .line 14
    .line 15
    packed-switch v2, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object v2, v1

    .line 19
    check-cast v2, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 20
    .line 21
    iget-object v14, v2, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 22
    .line 23
    const-wide v15, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 29
    .line 30
    .line 31
    move-result-wide v8

    .line 32
    invoke-virtual {v3, v8, v9}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰哲世(J)V

    .line 33
    .line 34
    .line 35
    iget-object v8, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 36
    .line 37
    invoke-virtual {v8}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世()Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;

    .line 38
    .line 39
    .line 40
    move-result-object v8

    .line 41
    invoke-static {v8}, Landroidx/compose/ui/graphics/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)Landroid/graphics/Canvas;

    .line 42
    .line 43
    .line 44
    move-result-object v8

    .line 45
    iget-object v9, v3, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 46
    .line 47
    check-cast v9, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 48
    .line 49
    invoke-virtual {v9}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 53
    .line 54
    .line 55
    move-result-wide v17

    .line 56
    invoke-static/range {v17 .. v18}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(J)Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_0

    .line 61
    .line 62
    invoke-virtual {v2}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 63
    .line 64
    .line 65
    goto/16 :goto_15

    .line 66
    .line 67
    :cond_0
    invoke-virtual {v8}, Landroid/graphics/Canvas;->isHardwareAccelerated()Z

    .line 68
    .line 69
    .line 70
    move-result v9

    .line 71
    if-nez v9, :cond_9

    .line 72
    .line 73
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 78
    .line 79
    .line 80
    :cond_1
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 85
    .line 86
    .line 87
    :cond_2
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

    .line 88
    .line 89
    if-eqz v0, :cond_3

    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 92
    .line 93
    .line 94
    :cond_3
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

    .line 95
    .line 96
    if-eqz v0, :cond_4

    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 99
    .line 100
    .line 101
    :cond_4
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 106
    .line 107
    .line 108
    :cond_5
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

    .line 109
    .line 110
    if-eqz v0, :cond_6

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 113
    .line 114
    .line 115
    :cond_6
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;

    .line 116
    .line 117
    if-eqz v0, :cond_7

    .line 118
    .line 119
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 120
    .line 121
    .line 122
    :cond_7
    iget-object v0, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

    .line 123
    .line 124
    if-eqz v0, :cond_8

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->finish()V

    .line 127
    .line 128
    .line 129
    :cond_8
    invoke-virtual {v2}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 130
    .line 131
    .line 132
    goto/16 :goto_15

    .line 133
    .line 134
    :cond_9
    const/high16 v9, 0x41f00000    # 30.0f

    .line 135
    .line 136
    invoke-virtual {v2, v9}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子苏世楪哲兰(F)F

    .line 137
    .line 138
    .line 139
    move-result v9

    .line 140
    iget-object v4, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

    .line 141
    .line 142
    invoke-static {v4}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 143
    .line 144
    .line 145
    move-result v4

    .line 146
    if-nez v4, :cond_b

    .line 147
    .line 148
    iget-object v4, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

    .line 149
    .line 150
    invoke-static {v4}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-nez v4, :cond_b

    .line 155
    .line 156
    iget-object v4, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

    .line 157
    .line 158
    invoke-static {v4}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 159
    .line 160
    .line 161
    move-result v4

    .line 162
    if-nez v4, :cond_b

    .line 163
    .line 164
    iget-object v4, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

    .line 165
    .line 166
    invoke-static {v4}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    if-eqz v4, :cond_a

    .line 171
    .line 172
    goto :goto_0

    .line 173
    :cond_a
    const/4 v4, 0x0

    .line 174
    goto :goto_1

    .line 175
    :cond_b
    :goto_0
    const/4 v4, 0x1

    .line 176
    :goto_1
    iget-object v6, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

    .line 177
    .line 178
    invoke-static {v6}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-nez v6, :cond_d

    .line 183
    .line 184
    iget-object v6, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;

    .line 185
    .line 186
    invoke-static {v6}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 187
    .line 188
    .line 189
    move-result v6

    .line 190
    if-nez v6, :cond_d

    .line 191
    .line 192
    iget-object v6, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

    .line 193
    .line 194
    invoke-static {v6}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    if-nez v6, :cond_d

    .line 199
    .line 200
    iget-object v6, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

    .line 201
    .line 202
    invoke-static {v6}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 203
    .line 204
    .line 205
    move-result v6

    .line 206
    if-eqz v6, :cond_c

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :cond_c
    const/4 v6, 0x0

    .line 210
    goto :goto_3

    .line 211
    :cond_d
    :goto_2
    const/4 v6, 0x1

    .line 212
    :goto_3
    if-eqz v4, :cond_e

    .line 213
    .line 214
    if-eqz v6, :cond_e

    .line 215
    .line 216
    const/16 v19, 0x20

    .line 217
    .line 218
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪苏世哲()Landroid/graphics/RenderNode;

    .line 219
    .line 220
    .line 221
    move-result-object v10

    .line 222
    move-wide/from16 v20, v15

    .line 223
    .line 224
    invoke-virtual {v8}, Landroid/graphics/Canvas;->getWidth()I

    .line 225
    .line 226
    .line 227
    move-result v15

    .line 228
    invoke-virtual {v8}, Landroid/graphics/Canvas;->getHeight()I

    .line 229
    .line 230
    .line 231
    move-result v5

    .line 232
    invoke-static {v10, v15, v5}, Landroidx/activity/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏(Landroid/graphics/RenderNode;II)V

    .line 233
    .line 234
    .line 235
    goto :goto_4

    .line 236
    :cond_e
    move-wide/from16 v20, v15

    .line 237
    .line 238
    const/16 v19, 0x20

    .line 239
    .line 240
    if-eqz v4, :cond_f

    .line 241
    .line 242
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪苏世哲()Landroid/graphics/RenderNode;

    .line 243
    .line 244
    .line 245
    move-result-object v5

    .line 246
    invoke-virtual {v8}, Landroid/graphics/Canvas;->getWidth()I

    .line 247
    .line 248
    .line 249
    move-result v10

    .line 250
    invoke-static {v9}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(F)I

    .line 251
    .line 252
    .line 253
    move-result v15

    .line 254
    mul-int/lit8 v15, v15, 0x2

    .line 255
    .line 256
    add-int/2addr v15, v10

    .line 257
    invoke-virtual {v8}, Landroid/graphics/Canvas;->getHeight()I

    .line 258
    .line 259
    .line 260
    move-result v10

    .line 261
    invoke-static {v5, v15, v10}, Landroidx/activity/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏(Landroid/graphics/RenderNode;II)V

    .line 262
    .line 263
    .line 264
    goto :goto_4

    .line 265
    :cond_f
    if-eqz v6, :cond_33

    .line 266
    .line 267
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪苏世哲()Landroid/graphics/RenderNode;

    .line 268
    .line 269
    .line 270
    move-result-object v5

    .line 271
    invoke-virtual {v8}, Landroid/graphics/Canvas;->getWidth()I

    .line 272
    .line 273
    .line 274
    move-result v10

    .line 275
    invoke-virtual {v8}, Landroid/graphics/Canvas;->getHeight()I

    .line 276
    .line 277
    .line 278
    move-result v15

    .line 279
    invoke-static {v9}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(F)I

    .line 280
    .line 281
    .line 282
    move-result v22

    .line 283
    mul-int/lit8 v22, v22, 0x2

    .line 284
    .line 285
    add-int v15, v22, v15

    .line 286
    .line 287
    invoke-static {v5, v10, v15}, Landroidx/activity/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰哲苏(Landroid/graphics/RenderNode;II)V

    .line 288
    .line 289
    .line 290
    :goto_4
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪苏世哲()Landroid/graphics/RenderNode;

    .line 291
    .line 292
    .line 293
    move-result-object v5

    .line 294
    invoke-static {v5}, Landroidx/activity/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世苏兰哲(Landroid/graphics/RenderNode;)Landroid/graphics/RecordingCanvas;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;

    .line 299
    .line 300
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 301
    .line 302
    .line 303
    move-result v10

    .line 304
    if-eqz v10, :cond_11

    .line 305
    .line 306
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;

    .line 307
    .line 308
    if-nez v10, :cond_10

    .line 309
    .line 310
    sget-object v10, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 311
    .line 312
    invoke-virtual {v7, v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 313
    .line 314
    .line 315
    move-result-object v10

    .line 316
    iput-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;

    .line 317
    .line 318
    :cond_10
    invoke-static {v11, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 319
    .line 320
    .line 321
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->finish()V

    .line 322
    .line 323
    .line 324
    :cond_11
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

    .line 325
    .line 326
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 327
    .line 328
    .line 329
    move-result v10

    .line 330
    const/high16 v22, 0x3f800000    # 1.0f

    .line 331
    .line 332
    const/16 v15, 0x1f

    .line 333
    .line 334
    if-eqz v10, :cond_15

    .line 335
    .line 336
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰()Landroid/widget/EdgeEffect;

    .line 337
    .line 338
    .line 339
    move-result-object v10

    .line 340
    invoke-static {v12, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 341
    .line 342
    .line 343
    move-result v23

    .line 344
    iget-object v11, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

    .line 345
    .line 346
    invoke-static {v11}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 347
    .line 348
    .line 349
    move-result v11

    .line 350
    if-eqz v11, :cond_16

    .line 351
    .line 352
    invoke-virtual {v3}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏()J

    .line 353
    .line 354
    .line 355
    move-result-wide v24

    .line 356
    and-long v12, v24, v20

    .line 357
    .line 358
    long-to-int v12, v12

    .line 359
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 360
    .line 361
    .line 362
    move-result v12

    .line 363
    iget-object v13, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;

    .line 364
    .line 365
    if-nez v13, :cond_12

    .line 366
    .line 367
    sget-object v13, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 368
    .line 369
    invoke-virtual {v7, v13}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 370
    .line 371
    .line 372
    move-result-object v13

    .line 373
    iput-object v13, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲兰世:Landroid/widget/EdgeEffect;

    .line 374
    .line 375
    :cond_12
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 376
    .line 377
    if-lt v11, v15, :cond_13

    .line 378
    .line 379
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/widget/EdgeEffect;)F

    .line 380
    .line 381
    .line 382
    move-result v10

    .line 383
    goto :goto_5

    .line 384
    :cond_13
    const/4 v10, 0x0

    .line 385
    :goto_5
    sub-float v12, v22, v12

    .line 386
    .line 387
    if-lt v11, v15, :cond_14

    .line 388
    .line 389
    invoke-static {v13, v10, v12}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Landroid/widget/EdgeEffect;FF)F

    .line 390
    .line 391
    .line 392
    goto :goto_6

    .line 393
    :cond_14
    invoke-virtual {v13, v10, v12}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 394
    .line 395
    .line 396
    goto :goto_6

    .line 397
    :cond_15
    const/16 v23, 0x0

    .line 398
    .line 399
    :cond_16
    :goto_6
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

    .line 400
    .line 401
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 402
    .line 403
    .line 404
    move-result v10

    .line 405
    if-eqz v10, :cond_18

    .line 406
    .line 407
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

    .line 408
    .line 409
    if-nez v10, :cond_17

    .line 410
    .line 411
    sget-object v10, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 412
    .line 413
    invoke-virtual {v7, v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 414
    .line 415
    .line 416
    move-result-object v10

    .line 417
    iput-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

    .line 418
    .line 419
    :cond_17
    const/high16 v11, 0x43340000    # 180.0f

    .line 420
    .line 421
    invoke-static {v11, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 422
    .line 423
    .line 424
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->finish()V

    .line 425
    .line 426
    .line 427
    :cond_18
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

    .line 428
    .line 429
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 430
    .line 431
    .line 432
    move-result v10

    .line 433
    if-eqz v10, :cond_1e

    .line 434
    .line 435
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲()Landroid/widget/EdgeEffect;

    .line 436
    .line 437
    .line 438
    move-result-object v10

    .line 439
    const/4 v11, 0x0

    .line 440
    invoke-static {v11, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 441
    .line 442
    .line 443
    move-result v12

    .line 444
    if-nez v12, :cond_1a

    .line 445
    .line 446
    if-eqz v23, :cond_19

    .line 447
    .line 448
    goto :goto_7

    .line 449
    :cond_19
    const/16 v23, 0x0

    .line 450
    .line 451
    goto :goto_8

    .line 452
    :cond_1a
    :goto_7
    const/16 v23, 0x1

    .line 453
    .line 454
    :goto_8
    iget-object v11, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

    .line 455
    .line 456
    invoke-static {v11}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 457
    .line 458
    .line 459
    move-result v11

    .line 460
    if-eqz v11, :cond_1e

    .line 461
    .line 462
    invoke-virtual {v3}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏()J

    .line 463
    .line 464
    .line 465
    move-result-wide v11

    .line 466
    shr-long v11, v11, v19

    .line 467
    .line 468
    long-to-int v11, v11

    .line 469
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 470
    .line 471
    .line 472
    move-result v11

    .line 473
    iget-object v12, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

    .line 474
    .line 475
    if-nez v12, :cond_1b

    .line 476
    .line 477
    sget-object v12, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 478
    .line 479
    invoke-virtual {v7, v12}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 480
    .line 481
    .line 482
    move-result-object v12

    .line 483
    iput-object v12, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Landroid/widget/EdgeEffect;

    .line 484
    .line 485
    :cond_1b
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 486
    .line 487
    if-lt v13, v15, :cond_1c

    .line 488
    .line 489
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/widget/EdgeEffect;)F

    .line 490
    .line 491
    .line 492
    move-result v10

    .line 493
    goto :goto_9

    .line 494
    :cond_1c
    const/4 v10, 0x0

    .line 495
    :goto_9
    if-lt v13, v15, :cond_1d

    .line 496
    .line 497
    invoke-static {v12, v10, v11}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Landroid/widget/EdgeEffect;FF)F

    .line 498
    .line 499
    .line 500
    goto :goto_a

    .line 501
    :cond_1d
    invoke-virtual {v12, v10, v11}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 502
    .line 503
    .line 504
    :cond_1e
    :goto_a
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

    .line 505
    .line 506
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 507
    .line 508
    .line 509
    move-result v10

    .line 510
    if-eqz v10, :cond_20

    .line 511
    .line 512
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

    .line 513
    .line 514
    if-nez v10, :cond_1f

    .line 515
    .line 516
    sget-object v10, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 517
    .line 518
    invoke-virtual {v7, v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 519
    .line 520
    .line 521
    move-result-object v10

    .line 522
    iput-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

    .line 523
    .line 524
    :cond_1f
    const/high16 v11, 0x43870000    # 270.0f

    .line 525
    .line 526
    invoke-static {v11, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 527
    .line 528
    .line 529
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->finish()V

    .line 530
    .line 531
    .line 532
    :cond_20
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

    .line 533
    .line 534
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 535
    .line 536
    .line 537
    move-result v10

    .line 538
    if-eqz v10, :cond_26

    .line 539
    .line 540
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏()Landroid/widget/EdgeEffect;

    .line 541
    .line 542
    .line 543
    move-result-object v10

    .line 544
    const/high16 v11, 0x42b40000    # 90.0f

    .line 545
    .line 546
    invoke-static {v11, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 547
    .line 548
    .line 549
    move-result v11

    .line 550
    if-nez v11, :cond_22

    .line 551
    .line 552
    if-eqz v23, :cond_21

    .line 553
    .line 554
    goto :goto_b

    .line 555
    :cond_21
    const/16 v23, 0x0

    .line 556
    .line 557
    goto :goto_c

    .line 558
    :cond_22
    :goto_b
    const/16 v23, 0x1

    .line 559
    .line 560
    :goto_c
    iget-object v11, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

    .line 561
    .line 562
    invoke-static {v11}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 563
    .line 564
    .line 565
    move-result v11

    .line 566
    if-eqz v11, :cond_26

    .line 567
    .line 568
    invoke-virtual {v3}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏()J

    .line 569
    .line 570
    .line 571
    move-result-wide v11

    .line 572
    and-long v11, v11, v20

    .line 573
    .line 574
    long-to-int v11, v11

    .line 575
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 576
    .line 577
    .line 578
    move-result v11

    .line 579
    iget-object v12, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

    .line 580
    .line 581
    if-nez v12, :cond_23

    .line 582
    .line 583
    sget-object v12, Landroidx/compose/foundation/gestures/Orientation;->Horizontal:Landroidx/compose/foundation/gestures/Orientation;

    .line 584
    .line 585
    invoke-virtual {v7, v12}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 586
    .line 587
    .line 588
    move-result-object v12

    .line 589
    iput-object v12, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰世哲:Landroid/widget/EdgeEffect;

    .line 590
    .line 591
    :cond_23
    sget v13, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 592
    .line 593
    if-lt v13, v15, :cond_24

    .line 594
    .line 595
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/widget/EdgeEffect;)F

    .line 596
    .line 597
    .line 598
    move-result v10

    .line 599
    goto :goto_d

    .line 600
    :cond_24
    const/4 v10, 0x0

    .line 601
    :goto_d
    if-lt v13, v15, :cond_25

    .line 602
    .line 603
    invoke-static {v12, v10, v11}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Landroid/widget/EdgeEffect;FF)F

    .line 604
    .line 605
    .line 606
    goto :goto_e

    .line 607
    :cond_25
    invoke-virtual {v12, v10, v11}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 608
    .line 609
    .line 610
    :cond_26
    :goto_e
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

    .line 611
    .line 612
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 613
    .line 614
    .line 615
    move-result v10

    .line 616
    if-eqz v10, :cond_28

    .line 617
    .line 618
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

    .line 619
    .line 620
    if-nez v10, :cond_27

    .line 621
    .line 622
    sget-object v10, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 623
    .line 624
    invoke-virtual {v7, v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 625
    .line 626
    .line 627
    move-result-object v10

    .line 628
    iput-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

    .line 629
    .line 630
    :cond_27
    const/4 v11, 0x0

    .line 631
    invoke-static {v11, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 632
    .line 633
    .line 634
    invoke-virtual {v10}, Landroid/widget/EdgeEffect;->finish()V

    .line 635
    .line 636
    .line 637
    :cond_28
    iget-object v10, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

    .line 638
    .line 639
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 640
    .line 641
    .line 642
    move-result v10

    .line 643
    if-eqz v10, :cond_2f

    .line 644
    .line 645
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲()Landroid/widget/EdgeEffect;

    .line 646
    .line 647
    .line 648
    move-result-object v10

    .line 649
    const/high16 v11, 0x43340000    # 180.0f

    .line 650
    .line 651
    invoke-static {v11, v10, v5}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世苏哲(FLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 652
    .line 653
    .line 654
    move-result v11

    .line 655
    if-nez v11, :cond_2a

    .line 656
    .line 657
    if-eqz v23, :cond_29

    .line 658
    .line 659
    goto :goto_f

    .line 660
    :cond_29
    const/16 v17, 0x0

    .line 661
    .line 662
    goto :goto_10

    .line 663
    :cond_2a
    :goto_f
    const/16 v17, 0x1

    .line 664
    .line 665
    :goto_10
    iget-object v11, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

    .line 666
    .line 667
    invoke-static {v11}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Landroid/widget/EdgeEffect;)Z

    .line 668
    .line 669
    .line 670
    move-result v11

    .line 671
    if-eqz v11, :cond_2e

    .line 672
    .line 673
    invoke-virtual {v3}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰哲苏()J

    .line 674
    .line 675
    .line 676
    move-result-wide v11

    .line 677
    shr-long v11, v11, v19

    .line 678
    .line 679
    long-to-int v11, v11

    .line 680
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 681
    .line 682
    .line 683
    move-result v11

    .line 684
    iget-object v12, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

    .line 685
    .line 686
    if-nez v12, :cond_2b

    .line 687
    .line 688
    sget-object v12, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 689
    .line 690
    invoke-virtual {v7, v12}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/foundation/gestures/Orientation;)Landroid/widget/EdgeEffect;

    .line 691
    .line 692
    .line 693
    move-result-object v12

    .line 694
    iput-object v12, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Landroid/widget/EdgeEffect;

    .line 695
    .line 696
    :cond_2b
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 697
    .line 698
    if-lt v7, v15, :cond_2c

    .line 699
    .line 700
    invoke-static {v10}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/widget/EdgeEffect;)F

    .line 701
    .line 702
    .line 703
    move-result v10

    .line 704
    goto :goto_11

    .line 705
    :cond_2c
    const/4 v10, 0x0

    .line 706
    :goto_11
    sub-float v11, v22, v11

    .line 707
    .line 708
    if-lt v7, v15, :cond_2d

    .line 709
    .line 710
    invoke-static {v12, v10, v11}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰(Landroid/widget/EdgeEffect;FF)F

    .line 711
    .line 712
    .line 713
    goto :goto_12

    .line 714
    :cond_2d
    invoke-virtual {v12, v10, v11}, Landroid/widget/EdgeEffect;->onPull(FF)V

    .line 715
    .line 716
    .line 717
    :cond_2e
    :goto_12
    move/from16 v23, v17

    .line 718
    .line 719
    :cond_2f
    if-eqz v23, :cond_30

    .line 720
    .line 721
    invoke-virtual {v3}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()V

    .line 722
    .line 723
    .line 724
    :cond_30
    if-eqz v6, :cond_31

    .line 725
    .line 726
    const/4 v3, 0x0

    .line 727
    goto :goto_13

    .line 728
    :cond_31
    move v3, v9

    .line 729
    :goto_13
    if-eqz v4, :cond_32

    .line 730
    .line 731
    const/4 v9, 0x0

    .line 732
    :cond_32
    invoke-virtual {v2}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 733
    .line 734
    .line 735
    move-result-object v4

    .line 736
    new-instance v6, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;

    .line 737
    .line 738
    invoke-direct {v6}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;-><init>()V

    .line 739
    .line 740
    .line 741
    iput-object v5, v6, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Landroid/graphics/Canvas;

    .line 742
    .line 743
    invoke-interface {v14}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 744
    .line 745
    .line 746
    move-result-wide v10

    .line 747
    iget-object v5, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 748
    .line 749
    invoke-virtual {v5}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪兰苏世哲()L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 750
    .line 751
    .line 752
    move-result-object v5

    .line 753
    iget-object v7, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 754
    .line 755
    invoke-virtual {v7}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世楪苏兰哲()Landroidx/compose/ui/unit/LayoutDirection;

    .line 756
    .line 757
    .line 758
    move-result-object v7

    .line 759
    iget-object v12, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 760
    .line 761
    invoke-virtual {v12}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世()Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;

    .line 762
    .line 763
    .line 764
    move-result-object v12

    .line 765
    iget-object v13, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 766
    .line 767
    move-object v15, v12

    .line 768
    invoke-virtual {v13}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世楪哲兰苏()J

    .line 769
    .line 770
    .line 771
    move-result-wide v12

    .line 772
    move-object/from16 v22, v2

    .line 773
    .line 774
    iget-object v2, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 775
    .line 776
    move-object/from16 v16, v15

    .line 777
    .line 778
    iget-object v15, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 779
    .line 780
    check-cast v15, Landroidx/compose/ui/graphics/layer/飘花落叶言子楪世苏哲兰;

    .line 781
    .line 782
    invoke-virtual {v2, v1}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏兰楪(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 783
    .line 784
    .line 785
    invoke-virtual {v2, v4}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰楪苏(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v2, v6}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏楪兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V

    .line 789
    .line 790
    .line 791
    invoke-virtual {v2, v10, v11}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰苏楪(J)V

    .line 792
    .line 793
    .line 794
    const/4 v4, 0x0

    .line 795
    iput-object v4, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 796
    .line 797
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世兰哲苏()V

    .line 798
    .line 799
    .line 800
    :try_start_0
    move-object v2, v1

    .line 801
    check-cast v2, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 802
    .line 803
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 804
    .line 805
    iget-object v2, v2, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 806
    .line 807
    iget-object v2, v2, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 808
    .line 809
    check-cast v2, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 810
    .line 811
    invoke-virtual {v2, v3, v9}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子世苏兰哲楪(FF)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 812
    .line 813
    .line 814
    :try_start_1
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 815
    .line 816
    .line 817
    :try_start_2
    check-cast v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 818
    .line 819
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 820
    .line 821
    iget-object v1, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 822
    .line 823
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 824
    .line 825
    check-cast v1, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 826
    .line 827
    neg-float v2, v3

    .line 828
    neg-float v3, v9

    .line 829
    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子世苏兰哲楪(FF)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 830
    .line 831
    .line 832
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世()V

    .line 833
    .line 834
    .line 835
    iget-object v1, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 836
    .line 837
    invoke-virtual {v1, v5}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏兰楪(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v1, v7}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰楪苏(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 841
    .line 842
    .line 843
    move-object/from16 v4, v16

    .line 844
    .line 845
    invoke-virtual {v1, v4}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏楪兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v1, v12, v13}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰苏楪(J)V

    .line 849
    .line 850
    .line 851
    iput-object v15, v1, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 852
    .line 853
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪苏世哲()Landroid/graphics/RenderNode;

    .line 854
    .line 855
    .line 856
    move-result-object v1

    .line 857
    invoke-static {v1}, Landroidx/activity/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世兰苏哲(Landroid/graphics/RenderNode;)V

    .line 858
    .line 859
    .line 860
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    .line 861
    .line 862
    .line 863
    move-result v1

    .line 864
    invoke-virtual {v8, v2, v3}, Landroid/graphics/Canvas;->translate(FF)V

    .line 865
    .line 866
    .line 867
    invoke-virtual {v0}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪苏世哲()Landroid/graphics/RenderNode;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    invoke-static {v8, v0}, Landroidx/activity/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪世哲兰苏(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V

    .line 872
    .line 873
    .line 874
    invoke-virtual {v8, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 875
    .line 876
    .line 877
    goto :goto_15

    .line 878
    :catchall_0
    move-exception v0

    .line 879
    move-object/from16 v4, v16

    .line 880
    .line 881
    goto :goto_14

    .line 882
    :catchall_1
    move-exception v0

    .line 883
    move-object/from16 v4, v16

    .line 884
    .line 885
    :try_start_3
    check-cast v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 886
    .line 887
    iget-object v1, v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 888
    .line 889
    iget-object v1, v1, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 890
    .line 891
    iget-object v1, v1, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 892
    .line 893
    check-cast v1, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;

    .line 894
    .line 895
    neg-float v2, v3

    .line 896
    neg-float v3, v9

    .line 897
    invoke-virtual {v1, v2, v3}, Landroidx/appcompat/app/飘花落叶言子苏楪哲兰世;->飘花落叶言子世苏兰哲楪(FF)V

    .line 898
    .line 899
    .line 900
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 901
    :catchall_2
    move-exception v0

    .line 902
    :goto_14
    invoke-virtual {v6}, Landroidx/compose/ui/graphics/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲苏兰世()V

    .line 903
    .line 904
    .line 905
    iget-object v1, v14, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 906
    .line 907
    invoke-virtual {v1, v5}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏兰楪(L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v1, v7}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰楪苏(Landroidx/compose/ui/unit/LayoutDirection;)V

    .line 911
    .line 912
    .line 913
    invoke-virtual {v1, v4}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲苏楪兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v1, v12, v13}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子世哲兰苏楪(J)V

    .line 917
    .line 918
    .line 919
    iput-object v15, v1, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 920
    .line 921
    throw v0

    .line 922
    :cond_33
    move-object/from16 v22, v2

    .line 923
    .line 924
    invoke-virtual/range {v22 .. v22}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 925
    .line 926
    .line 927
    :goto_15
    return-void

    .line 928
    :pswitch_0
    const/16 v19, 0x20

    .line 929
    .line 930
    const-wide v20, 0xffffffffL

    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    iget-object v0, v0, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子世苏兰楪哲:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v0, Landroidx/compose/foundation/layout/飘花落叶言子苏哲世楪兰;

    .line 938
    .line 939
    check-cast v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;

    .line 940
    .line 941
    iget-object v2, v1, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;

    .line 942
    .line 943
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 944
    .line 945
    .line 946
    move-result-wide v4

    .line 947
    invoke-virtual {v3, v4, v5}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰哲世(J)V

    .line 948
    .line 949
    .line 950
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 951
    .line 952
    .line 953
    move-result-wide v4

    .line 954
    invoke-static {v4, v5}, L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(J)Z

    .line 955
    .line 956
    .line 957
    move-result v4

    .line 958
    if-eqz v4, :cond_34

    .line 959
    .line 960
    invoke-virtual {v1}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 961
    .line 962
    .line 963
    goto/16 :goto_1d

    .line 964
    .line 965
    :cond_34
    invoke-virtual {v1}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏哲兰()V

    .line 966
    .line 967
    .line 968
    iget-object v4, v3, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 969
    .line 970
    check-cast v4, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 971
    .line 972
    invoke-virtual {v4}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 973
    .line 974
    .line 975
    iget-object v4, v2, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪哲兰世苏:Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;

    .line 976
    .line 977
    invoke-virtual {v4}, Landroidx/appcompat/app/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪哲兰苏世()Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;

    .line 978
    .line 979
    .line 980
    move-result-object v4

    .line 981
    invoke-static {v4}, Landroidx/compose/ui/graphics/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/graphics/飘花落叶言子楪兰苏世哲;)Landroid/graphics/Canvas;

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    iget-object v5, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Landroid/widget/EdgeEffect;

    .line 986
    .line 987
    invoke-static {v5}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 988
    .line 989
    .line 990
    move-result v5

    .line 991
    if-eqz v5, :cond_35

    .line 992
    .line 993
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰()Landroid/widget/EdgeEffect;

    .line 994
    .line 995
    .line 996
    move-result-object v5

    .line 997
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 998
    .line 999
    .line 1000
    move-result-wide v8

    .line 1001
    and-long v8, v8, v20

    .line 1002
    .line 1003
    long-to-int v6, v8

    .line 1004
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1005
    .line 1006
    .line 1007
    move-result v6

    .line 1008
    neg-float v6, v6

    .line 1009
    invoke-virtual {v1}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v8

    .line 1013
    invoke-interface {v0, v8}, Landroidx/compose/foundation/layout/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 1014
    .line 1015
    .line 1016
    move-result v8

    .line 1017
    invoke-virtual {v1, v8}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子苏世楪哲兰(F)F

    .line 1018
    .line 1019
    .line 1020
    move-result v8

    .line 1021
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1022
    .line 1023
    .line 1024
    move-result v6

    .line 1025
    int-to-long v9, v6

    .line 1026
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1027
    .line 1028
    .line 1029
    move-result v6

    .line 1030
    int-to-long v12, v6

    .line 1031
    shl-long v8, v9, v19

    .line 1032
    .line 1033
    and-long v12, v12, v20

    .line 1034
    .line 1035
    or-long/2addr v8, v12

    .line 1036
    const/high16 v11, 0x43870000    # 270.0f

    .line 1037
    .line 1038
    invoke-static {v11, v8, v9, v5, v4}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世哲苏(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1039
    .line 1040
    .line 1041
    move-result v5

    .line 1042
    goto :goto_16

    .line 1043
    :cond_35
    const/4 v5, 0x0

    .line 1044
    :goto_16
    iget-object v6, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Landroid/widget/EdgeEffect;

    .line 1045
    .line 1046
    invoke-static {v6}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 1047
    .line 1048
    .line 1049
    move-result v6

    .line 1050
    if-eqz v6, :cond_38

    .line 1051
    .line 1052
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲()Landroid/widget/EdgeEffect;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v6

    .line 1056
    invoke-interface {v0}, Landroidx/compose/foundation/layout/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲兰苏()F

    .line 1057
    .line 1058
    .line 1059
    move-result v8

    .line 1060
    invoke-virtual {v1, v8}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子苏世楪哲兰(F)F

    .line 1061
    .line 1062
    .line 1063
    move-result v8

    .line 1064
    const/4 v11, 0x0

    .line 1065
    invoke-static {v11}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1066
    .line 1067
    .line 1068
    move-result v9

    .line 1069
    int-to-long v9, v9

    .line 1070
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1071
    .line 1072
    .line 1073
    move-result v8

    .line 1074
    int-to-long v12, v8

    .line 1075
    shl-long v8, v9, v19

    .line 1076
    .line 1077
    and-long v12, v12, v20

    .line 1078
    .line 1079
    or-long/2addr v8, v12

    .line 1080
    invoke-static {v11, v8, v9, v6, v4}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世哲苏(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1081
    .line 1082
    .line 1083
    move-result v6

    .line 1084
    if-nez v6, :cond_37

    .line 1085
    .line 1086
    if-eqz v5, :cond_36

    .line 1087
    .line 1088
    goto :goto_17

    .line 1089
    :cond_36
    const/4 v5, 0x0

    .line 1090
    goto :goto_18

    .line 1091
    :cond_37
    :goto_17
    const/4 v5, 0x1

    .line 1092
    :cond_38
    :goto_18
    iget-object v6, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Landroid/widget/EdgeEffect;

    .line 1093
    .line 1094
    invoke-static {v6}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 1095
    .line 1096
    .line 1097
    move-result v6

    .line 1098
    if-eqz v6, :cond_3b

    .line 1099
    .line 1100
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏()Landroid/widget/EdgeEffect;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v6

    .line 1104
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v8

    .line 1108
    shr-long v8, v8, v19

    .line 1109
    .line 1110
    long-to-int v8, v8

    .line 1111
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1112
    .line 1113
    .line 1114
    move-result v8

    .line 1115
    invoke-static {v8}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(F)I

    .line 1116
    .line 1117
    .line 1118
    move-result v8

    .line 1119
    invoke-virtual {v1}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v9

    .line 1123
    invoke-interface {v0, v9}, Landroidx/compose/foundation/layout/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/unit/LayoutDirection;)F

    .line 1124
    .line 1125
    .line 1126
    move-result v9

    .line 1127
    int-to-float v8, v8

    .line 1128
    neg-float v8, v8

    .line 1129
    invoke-virtual {v1, v9}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子苏世楪哲兰(F)F

    .line 1130
    .line 1131
    .line 1132
    move-result v9

    .line 1133
    add-float/2addr v9, v8

    .line 1134
    const/16 v16, 0x0

    .line 1135
    .line 1136
    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1137
    .line 1138
    .line 1139
    move-result v8

    .line 1140
    int-to-long v10, v8

    .line 1141
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1142
    .line 1143
    .line 1144
    move-result v8

    .line 1145
    int-to-long v8, v8

    .line 1146
    shl-long v10, v10, v19

    .line 1147
    .line 1148
    and-long v8, v8, v20

    .line 1149
    .line 1150
    or-long/2addr v8, v10

    .line 1151
    const/high16 v11, 0x42b40000    # 90.0f

    .line 1152
    .line 1153
    invoke-static {v11, v8, v9, v6, v4}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世哲苏(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1154
    .line 1155
    .line 1156
    move-result v6

    .line 1157
    if-nez v6, :cond_3a

    .line 1158
    .line 1159
    if-eqz v5, :cond_39

    .line 1160
    .line 1161
    goto :goto_19

    .line 1162
    :cond_39
    const/4 v5, 0x0

    .line 1163
    goto :goto_1a

    .line 1164
    :cond_3a
    :goto_19
    const/4 v5, 0x1

    .line 1165
    :cond_3b
    :goto_1a
    iget-object v6, v7, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:Landroid/widget/EdgeEffect;

    .line 1166
    .line 1167
    invoke-static {v6}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroid/widget/EdgeEffect;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v6

    .line 1171
    if-eqz v6, :cond_3e

    .line 1172
    .line 1173
    invoke-virtual {v7}, Landroidx/compose/foundation/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲()Landroid/widget/EdgeEffect;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v6

    .line 1177
    invoke-interface {v0}, Landroidx/compose/foundation/layout/飘花落叶言子苏哲世楪兰;->飘花落叶言子楪世苏哲兰()F

    .line 1178
    .line 1179
    .line 1180
    move-result v0

    .line 1181
    invoke-virtual {v1, v0}, Landroidx/compose/ui/node/飘花落叶言子世苏楪兰哲;->飘花落叶言子苏世楪哲兰(F)F

    .line 1182
    .line 1183
    .line 1184
    move-result v0

    .line 1185
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 1186
    .line 1187
    .line 1188
    move-result-wide v7

    .line 1189
    shr-long v7, v7, v19

    .line 1190
    .line 1191
    long-to-int v1, v7

    .line 1192
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1193
    .line 1194
    .line 1195
    move-result v1

    .line 1196
    neg-float v1, v1

    .line 1197
    invoke-interface {v2}, Landroidx/compose/ui/graphics/drawscope/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰()J

    .line 1198
    .line 1199
    .line 1200
    move-result-wide v7

    .line 1201
    and-long v7, v7, v20

    .line 1202
    .line 1203
    long-to-int v2, v7

    .line 1204
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1205
    .line 1206
    .line 1207
    move-result v2

    .line 1208
    neg-float v2, v2

    .line 1209
    add-float/2addr v2, v0

    .line 1210
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1211
    .line 1212
    .line 1213
    move-result v0

    .line 1214
    int-to-long v0, v0

    .line 1215
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1216
    .line 1217
    .line 1218
    move-result v2

    .line 1219
    int-to-long v7, v2

    .line 1220
    shl-long v0, v0, v19

    .line 1221
    .line 1222
    and-long v7, v7, v20

    .line 1223
    .line 1224
    or-long/2addr v0, v7

    .line 1225
    const/high16 v11, 0x43340000    # 180.0f

    .line 1226
    .line 1227
    invoke-static {v11, v0, v1, v6, v4}, Landroidx/compose/foundation/飘花落叶言子世兰楪苏哲;->飘花落叶言子兰楪世哲苏(FJLandroid/widget/EdgeEffect;Landroid/graphics/Canvas;)Z

    .line 1228
    .line 1229
    .line 1230
    move-result v0

    .line 1231
    if-nez v0, :cond_3d

    .line 1232
    .line 1233
    if-eqz v5, :cond_3c

    .line 1234
    .line 1235
    goto :goto_1b

    .line 1236
    :cond_3c
    const/4 v4, 0x0

    .line 1237
    goto :goto_1c

    .line 1238
    :cond_3d
    :goto_1b
    const/4 v4, 0x1

    .line 1239
    :goto_1c
    move v5, v4

    .line 1240
    :cond_3e
    if-eqz v5, :cond_3f

    .line 1241
    .line 1242
    invoke-virtual {v3}, Landroidx/compose/foundation/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏世哲兰()V

    .line 1243
    .line 1244
    .line 1245
    :cond_3f
    :goto_1d
    return-void

    .line 1246
    nop

    .line 1247
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
