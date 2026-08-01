.class public final Landroidx/compose/ui/viewinterop/飘花落叶言子楪世苏哲兰;
.super Landroidx/core/view/飘花落叶言子苏哲世楪兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Landroid/view/ViewGroup;

.field public final synthetic 飘花落叶言子楪哲兰苏世:I


# direct methods
.method public synthetic constructor <init>(ILandroid/view/ViewGroup;)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Landroid/view/ViewGroup;

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    invoke-direct {p0, p1}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子苏哲世兰楪(Landroidx/core/view/飘花落叶言子哲兰世苏楪;Ljava/util/List;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;
    .locals 5

    .line 1
    iget p2, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Landroid/view/ViewGroup;

    .line 4
    .line 5
    packed-switch p2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;

    .line 9
    .line 10
    iget-boolean p2, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;->飘花落叶言子世楪哲兰苏:Z

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p0, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    invoke-static {p2, v2}, Ljava/lang/Math;->max(II)I

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    sub-int/2addr v3, v4

    .line 45
    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    sub-int/2addr p0, v0

    .line 58
    invoke-static {p2, p0}, Ljava/lang/Math;->max(II)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    if-nez p0, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    iget-object p1, p1, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 72
    .line 73
    invoke-virtual {p1, v1, v2, v3, p0}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪哲兰苏世(IIII)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    :goto_0
    return-object p1

    .line 78
    :pswitch_0
    check-cast p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰哲世(Landroidx/core/view/飘花落叶言子哲兰世苏楪;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final 飘花落叶言子苏哲兰楪世(Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;
    .locals 13

    .line 1
    iget p1, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:I

    .line 2
    .line 3
    const/16 v0, 0xc

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世苏哲:Landroid/view/ViewGroup;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    packed-switch p1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;

    .line 12
    .line 13
    iget-boolean p1, p0, Landroidx/compose/ui/window/飘花落叶言子楪哲世兰苏;->飘花落叶言子世楪哲兰苏:Z

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    sub-int/2addr v4, v5

    .line 47
    invoke-static {v1, v4}, Ljava/lang/Math;->max(II)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 52
    .line 53
    .line 54
    move-result p0

    .line 55
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    sub-int/2addr p0, p1

    .line 60
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez v2, :cond_1

    .line 65
    .line 66
    if-nez v3, :cond_1

    .line 67
    .line 68
    if-nez v4, :cond_1

    .line 69
    .line 70
    if-nez p0, :cond_1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-static {v2, v3, v4, p0}, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰(IIII)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    iget p1, p0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 78
    .line 79
    new-instance v1, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 80
    .line 81
    iget-object v2, p2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v2, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 84
    .line 85
    iget v3, p0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:I

    .line 86
    .line 87
    iget v4, p0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 88
    .line 89
    iget p0, p0, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏:I

    .line 90
    .line 91
    invoke-static {v2, p1, v3, v4, p0}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世兰苏哲(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;IIII)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    iget-object p2, p2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast p2, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 98
    .line 99
    invoke-static {p2, p1, v3, v4, p0}, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世兰苏哲(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;IIII)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-direct {v1, v2, v0, p0}, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    move-object p2, v1

    .line 107
    :goto_0
    return-object p2

    .line 108
    :pswitch_0
    check-cast p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;

    .line 109
    .line 110
    iget-object p0, p0, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->飘花落叶言子世哲兰楪苏:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 111
    .line 112
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世兰哲苏楪:Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;

    .line 113
    .line 114
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世哲苏兰:Landroidx/compose/ui/node/飘花落叶言子楪兰世哲苏;

    .line 115
    .line 116
    iget-object p1, p0, Landroidx/compose/ui/node/飘花落叶言子楪兰世哲苏;->飘花落叶言子苏哲世楪兰:Landroidx/compose/ui/node/飘花落叶言子哲楪世兰苏;

    .line 117
    .line 118
    iget-boolean p1, p1, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 119
    .line 120
    if-nez p1, :cond_2

    .line 121
    .line 122
    goto/16 :goto_2

    .line 123
    .line 124
    :cond_2
    const-wide/16 v2, 0x0

    .line 125
    .line 126
    invoke-virtual {p0, v2, v3}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世哲楪苏兰(J)J

    .line 127
    .line 128
    .line 129
    move-result-wide v2

    .line 130
    invoke-static {v2, v3}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(J)J

    .line 131
    .line 132
    .line 133
    move-result-wide v2

    .line 134
    const/16 p1, 0x20

    .line 135
    .line 136
    shr-long v4, v2, p1

    .line 137
    .line 138
    long-to-int v4, v4

    .line 139
    if-gez v4, :cond_3

    .line 140
    .line 141
    move v4, v1

    .line 142
    :cond_3
    const-wide v5, 0xffffffffL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    and-long/2addr v2, v5

    .line 148
    long-to-int v2, v2

    .line 149
    if-gez v2, :cond_4

    .line 150
    .line 151
    move v2, v1

    .line 152
    :cond_4
    invoke-static {p0}, Landroidx/compose/ui/layout/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;)Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-interface {v3}, Landroidx/compose/ui/layout/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏兰世哲()J

    .line 157
    .line 158
    .line 159
    move-result-wide v7

    .line 160
    shr-long v9, v7, p1

    .line 161
    .line 162
    long-to-int v3, v9

    .line 163
    and-long/2addr v7, v5

    .line 164
    long-to-int v7, v7

    .line 165
    iget-wide v8, p0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:J

    .line 166
    .line 167
    shr-long v10, v8, p1

    .line 168
    .line 169
    long-to-int v10, v10

    .line 170
    and-long/2addr v8, v5

    .line 171
    long-to-int v8, v8

    .line 172
    int-to-float v9, v10

    .line 173
    int-to-float v8, v8

    .line 174
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 175
    .line 176
    .line 177
    move-result v9

    .line 178
    int-to-long v9, v9

    .line 179
    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 180
    .line 181
    .line 182
    move-result v8

    .line 183
    int-to-long v11, v8

    .line 184
    shl-long v8, v9, p1

    .line 185
    .line 186
    and-long v10, v11, v5

    .line 187
    .line 188
    or-long/2addr v8, v10

    .line 189
    invoke-virtual {p0, v8, v9}, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世哲楪苏兰(J)J

    .line 190
    .line 191
    .line 192
    move-result-wide v8

    .line 193
    invoke-static {v8, v9}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪苏哲兰(J)J

    .line 194
    .line 195
    .line 196
    move-result-wide v8

    .line 197
    shr-long p0, v8, p1

    .line 198
    .line 199
    long-to-int p0, p0

    .line 200
    sub-int/2addr v3, p0

    .line 201
    if-gez v3, :cond_5

    .line 202
    .line 203
    move v3, v1

    .line 204
    :cond_5
    and-long p0, v8, v5

    .line 205
    .line 206
    long-to-int p0, p0

    .line 207
    sub-int/2addr v7, p0

    .line 208
    if-gez v7, :cond_6

    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_6
    move v1, v7

    .line 212
    :goto_1
    if-nez v4, :cond_7

    .line 213
    .line 214
    if-nez v2, :cond_7

    .line 215
    .line 216
    if-nez v3, :cond_7

    .line 217
    .line 218
    if-nez v1, :cond_7

    .line 219
    .line 220
    goto :goto_2

    .line 221
    :cond_7
    new-instance p0, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;

    .line 222
    .line 223
    iget-object p1, p2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast p1, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 226
    .line 227
    invoke-static {p1, v4, v2, v3, v1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;IIII)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 228
    .line 229
    .line 230
    move-result-object p1

    .line 231
    iget-object p2, p2, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 232
    .line 233
    check-cast p2, L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 234
    .line 235
    invoke-static {p2, v4, v2, v3, v1}, Landroidx/compose/ui/viewinterop/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏兰世哲(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;IIII)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    invoke-direct {p0, p1, v0, p2}, Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    move-object p2, p0

    .line 243
    :goto_2
    return-object p2

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
