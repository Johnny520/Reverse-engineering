.class public abstract Landroidx/compose/foundation/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# direct methods
.method public static final 飘花落叶言子楪世兰哲苏(JLandroidx/compose/foundation/gestures/Orientation;)V
    .locals 2

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    const v1, 0x7fffffff

    .line 4
    .line 5
    .line 6
    if-ne p2, v0, :cond_1

    .line 7
    .line 8
    invoke-static {p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(J)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-eq p0, v1, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const-string p0, "Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 16
    .line 17
    invoke-static {p0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    invoke-static {p0, p1}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲(J)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    if-eq p0, v1, :cond_2

    .line 26
    .line 27
    :goto_0
    return-void

    .line 28
    :cond_2
    const-string p0, "Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container."

    .line 29
    .line 30
    invoke-static {p0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public static final 飘花落叶言子楪世兰苏哲(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;JLandroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 7

    .line 1
    sget v0, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    new-instance v1, Landroidx/compose/foundation/飘花落叶言子楪苏世兰哲;

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/4 v6, 0x2

    .line 7
    move-wide v2, p1

    .line 8
    move-object v5, p3

    .line 9
    invoke-direct/range {v1 .. v6}, Landroidx/compose/foundation/飘花落叶言子楪苏世兰哲;-><init>(JLandroidx/compose/ui/graphics/飘花落叶言子世苏哲楪兰;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;I)V

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v1}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲兰苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/graphics/飘花落叶言子世苏哲楪兰;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 6

    .line 1
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子楪苏世兰哲;

    .line 2
    .line 3
    sget v1, Landroidx/compose/ui/platform/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:I

    .line 4
    .line 5
    const/4 v5, 0x1

    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    sget-object v4, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/graphics/飘花落叶言子世哲苏兰楪;

    .line 9
    .line 10
    move-object v3, p1

    .line 11
    invoke-direct/range {v0 .. v5}, Landroidx/compose/foundation/飘花落叶言子楪苏世兰哲;-><init>(JLandroidx/compose/ui/graphics/飘花落叶言子世苏哲楪兰;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static 飘花落叶言子楪世哲苏兰(Landroid/widget/EdgeEffect;FFL飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;)F
    .locals 8

    .line 1
    sget v0, Landroidx/compose/foundation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:F

    .line 2
    .line 3
    const v0, 0x43c10b3d

    .line 4
    .line 5
    .line 6
    invoke-interface {p3}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲()F

    .line 7
    .line 8
    .line 9
    move-result p3

    .line 10
    mul-float/2addr p3, v0

    .line 11
    const/high16 v0, 0x43200000    # 160.0f

    .line 12
    .line 13
    mul-float/2addr p3, v0

    .line 14
    const v0, 0x3f570a3d    # 0.84f

    .line 15
    .line 16
    .line 17
    mul-float/2addr p3, v0

    .line 18
    float-to-double v0, p3

    .line 19
    const p3, 0x3eb33333    # 0.35f

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    mul-float/2addr v2, p3

    .line 27
    float-to-double v2, v2

    .line 28
    sget p3, Landroidx/compose/foundation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:F

    .line 29
    .line 30
    float-to-double v4, p3

    .line 31
    mul-double/2addr v4, v0

    .line 32
    div-double/2addr v2, v4

    .line 33
    invoke-static {v2, v3}, Ljava/lang/Math;->log(D)D

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    sget-wide v2, Landroidx/compose/foundation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:D

    .line 38
    .line 39
    sget-wide v6, Landroidx/compose/foundation/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰:D

    .line 40
    .line 41
    div-double/2addr v2, v6

    .line 42
    mul-double/2addr v2, v0

    .line 43
    invoke-static {v2, v3}, Ljava/lang/Math;->exp(D)D

    .line 44
    .line 45
    .line 46
    move-result-wide v0

    .line 47
    mul-double/2addr v0, v4

    .line 48
    double-to-float p3, v0

    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 50
    .line 51
    const/4 v1, 0x0

    .line 52
    const/16 v2, 0x1f

    .line 53
    .line 54
    if-lt v0, v2, :cond_0

    .line 55
    .line 56
    invoke-static {p0}, Landroidx/compose/foundation/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲(Landroid/widget/EdgeEffect;)F

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v3, v1

    .line 62
    :goto_0
    mul-float/2addr v3, p2

    .line 63
    cmpg-float p2, p3, v3

    .line 64
    .line 65
    if-gtz p2, :cond_3

    .line 66
    .line 67
    invoke-static {p1}, L飘花落叶言世子兰楪哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世楪哲苏兰(F)I

    .line 68
    .line 69
    .line 70
    move-result p2

    .line 71
    if-lt v0, v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {p0, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 74
    .line 75
    .line 76
    return p1

    .line 77
    :cond_1
    invoke-virtual {p0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    if-eqz p3, :cond_2

    .line 82
    .line 83
    invoke-virtual {p0, p2}, Landroid/widget/EdgeEffect;->onAbsorb(I)V

    .line 84
    .line 85
    .line 86
    :cond_2
    return p1

    .line 87
    :cond_3
    return v1
.end method

.method public static final 飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;FLandroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;II)V
    .locals 16

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move/from16 v7, p7

    .line 4
    .line 5
    move-object/from16 v0, p6

    .line 6
    .line 7
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 8
    .line 9
    const v1, 0x441d0e20

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 13
    .line 14
    .line 15
    move-object/from16 v9, p0

    .line 16
    .line 17
    invoke-virtual {v0, v9}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v1, 0x2

    .line 26
    :goto_0
    or-int/2addr v1, v7

    .line 27
    and-int/lit16 v3, v7, 0x180

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, v2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const/16 v3, 0x100

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const/16 v3, 0x80

    .line 41
    .line 42
    :goto_1
    or-int/2addr v1, v3

    .line 43
    :cond_2
    and-int/lit8 v3, p8, 0x8

    .line 44
    .line 45
    if-eqz v3, :cond_3

    .line 46
    .line 47
    or-int/lit16 v1, v1, 0xc00

    .line 48
    .line 49
    move-object/from16 v4, p2

    .line 50
    .line 51
    goto :goto_3

    .line 52
    :cond_3
    move-object/from16 v4, p2

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_4

    .line 59
    .line 60
    const/16 v5, 0x800

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_4
    const/16 v5, 0x400

    .line 64
    .line 65
    :goto_2
    or-int/2addr v1, v5

    .line 66
    :goto_3
    and-int/lit16 v5, v7, 0x6000

    .line 67
    .line 68
    move-object/from16 v11, p3

    .line 69
    .line 70
    if-nez v5, :cond_6

    .line 71
    .line 72
    invoke-virtual {v0, v11}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_5

    .line 77
    .line 78
    const/16 v5, 0x4000

    .line 79
    .line 80
    goto :goto_4

    .line 81
    :cond_5
    const/16 v5, 0x2000

    .line 82
    .line 83
    :goto_4
    or-int/2addr v1, v5

    .line 84
    :cond_6
    and-int/lit8 v5, p8, 0x20

    .line 85
    .line 86
    if-eqz v5, :cond_7

    .line 87
    .line 88
    const/high16 v6, 0x30000

    .line 89
    .line 90
    or-int/2addr v1, v6

    .line 91
    move/from16 v6, p4

    .line 92
    .line 93
    goto :goto_6

    .line 94
    :cond_7
    move/from16 v6, p4

    .line 95
    .line 96
    invoke-virtual {v0, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰(F)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_8

    .line 101
    .line 102
    const/high16 v8, 0x20000

    .line 103
    .line 104
    goto :goto_5

    .line 105
    :cond_8
    const/high16 v8, 0x10000

    .line 106
    .line 107
    :goto_5
    or-int/2addr v1, v8

    .line 108
    :goto_6
    and-int/lit8 v8, p8, 0x40

    .line 109
    .line 110
    if-eqz v8, :cond_9

    .line 111
    .line 112
    const/high16 v10, 0x180000

    .line 113
    .line 114
    or-int/2addr v1, v10

    .line 115
    move-object/from16 v10, p5

    .line 116
    .line 117
    goto :goto_8

    .line 118
    :cond_9
    move-object/from16 v10, p5

    .line 119
    .line 120
    invoke-virtual {v0, v10}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v12

    .line 124
    if-eqz v12, :cond_a

    .line 125
    .line 126
    const/high16 v12, 0x100000

    .line 127
    .line 128
    goto :goto_7

    .line 129
    :cond_a
    const/high16 v12, 0x80000

    .line 130
    .line 131
    :goto_7
    or-int/2addr v1, v12

    .line 132
    :goto_8
    const v12, 0x92493

    .line 133
    .line 134
    .line 135
    and-int/2addr v12, v1

    .line 136
    const v13, 0x92492

    .line 137
    .line 138
    .line 139
    const/4 v14, 0x0

    .line 140
    const/4 v15, 0x1

    .line 141
    if-eq v12, v13, :cond_b

    .line 142
    .line 143
    move v12, v15

    .line 144
    goto :goto_9

    .line 145
    :cond_b
    move v12, v14

    .line 146
    :goto_9
    and-int/2addr v1, v15

    .line 147
    invoke-virtual {v0, v1, v12}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    if-eqz v1, :cond_11

    .line 152
    .line 153
    if-eqz v3, :cond_c

    .line 154
    .line 155
    sget-object v1, Landroidx/compose/ui/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪兰世哲苏:Landroidx/compose/ui/飘花落叶言子楪苏世哲兰;

    .line 156
    .line 157
    move-object v10, v1

    .line 158
    goto :goto_a

    .line 159
    :cond_c
    move-object v10, v4

    .line 160
    :goto_a
    if-eqz v5, :cond_d

    .line 161
    .line 162
    const/high16 v1, 0x3f800000    # 1.0f

    .line 163
    .line 164
    move v12, v1

    .line 165
    goto :goto_b

    .line 166
    :cond_d
    move v12, v6

    .line 167
    :goto_b
    if-eqz v8, :cond_e

    .line 168
    .line 169
    const/4 v1, 0x0

    .line 170
    move-object v13, v1

    .line 171
    goto :goto_c

    .line 172
    :cond_e
    move-object/from16 v13, p5

    .line 173
    .line 174
    :goto_c
    const v1, 0x713643c2

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世哲兰(I)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v14}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 181
    .line 182
    .line 183
    sget-object v1, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 184
    .line 185
    invoke-interface {v2, v1}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    invoke-static {v1}, Landroidx/compose/ui/draw/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    const/4 v14, 0x2

    .line 194
    invoke-static/range {v8 .. v14}, Landroidx/compose/ui/draw/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;FLandroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲楪兰苏()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    sget-object v4, Landroidx/compose/runtime/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪世哲兰苏;

    .line 203
    .line 204
    if-ne v3, v4, :cond_f

    .line 205
    .line 206
    sget-object v3, Landroidx/compose/foundation/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/foundation/飘花落叶言子世兰哲楪苏;

    .line 207
    .line 208
    invoke-virtual {v0, v3}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏世哲兰楪(Ljava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_f
    check-cast v3, Landroidx/compose/ui/layout/飘花落叶言子世兰苏楪哲;

    .line 212
    .line 213
    iget-wide v4, v0, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏哲楪:J

    .line 214
    .line 215
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    invoke-static {v0, v1}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰哲世()Landroidx/compose/runtime/internal/飘花落叶言子楪苏哲世兰;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    sget-object v6, Landroidx/compose/ui/node/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;

    .line 228
    .line 229
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v6, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 233
    .line 234
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪哲兰世()V

    .line 235
    .line 236
    .line 237
    iget-boolean v8, v0, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰苏楪哲:Z

    .line 238
    .line 239
    if-eqz v8, :cond_10

    .line 240
    .line 241
    invoke-virtual {v0, v6}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏兰世哲(L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 242
    .line 243
    .line 244
    goto :goto_d

    .line 245
    :cond_10
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏哲楪世兰()V

    .line 246
    .line 247
    .line 248
    :goto_d
    sget-object v6, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰哲苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 249
    .line 250
    invoke-static {v0, v3, v6}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 251
    .line 252
    .line 253
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世兰苏哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 254
    .line 255
    invoke-static {v0, v5, v3}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 256
    .line 257
    .line 258
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世兰哲:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 259
    .line 260
    invoke-static {v0, v3}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世苏楪兰哲(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)V

    .line 261
    .line 262
    .line 263
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 264
    .line 265
    invoke-static {v0, v1, v3}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 269
    .line 270
    .line 271
    move-result-object v1

    .line 272
    sget-object v3, Landroidx/compose/ui/node/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 273
    .line 274
    invoke-static {v0, v1, v3}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Ljava/lang/Object;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0, v15}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲苏兰世(Z)V

    .line 278
    .line 279
    .line 280
    move-object v3, v10

    .line 281
    move v5, v12

    .line 282
    move-object v6, v13

    .line 283
    goto :goto_e

    .line 284
    :cond_11
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 285
    .line 286
    .line 287
    move-object v3, v4

    .line 288
    move v5, v6

    .line 289
    move-object/from16 v6, p5

    .line 290
    .line 291
    :goto_e
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    if-eqz v9, :cond_12

    .line 296
    .line 297
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子世兰苏哲楪;

    .line 298
    .line 299
    move-object/from16 v1, p0

    .line 300
    .line 301
    move-object/from16 v4, p3

    .line 302
    .line 303
    move/from16 v8, p8

    .line 304
    .line 305
    invoke-direct/range {v0 .. v8}, Landroidx/compose/foundation/飘花落叶言子世兰苏哲楪;-><init>(Landroidx/compose/ui/graphics/painter/飘花落叶言子楪世苏兰哲;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/飘花落叶言子楪世哲苏兰;Landroidx/compose/ui/layout/飘花落叶言子苏楪哲世兰;FLandroidx/compose/ui/graphics/飘花落叶言子楪哲苏世兰;II)V

    .line 306
    .line 307
    .line 308
    iput-object v0, v9, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 309
    .line 310
    :cond_12
    return-void
.end method

.method public static final 飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;I)V
    .locals 5

    .line 1
    check-cast p2, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 2
    .line 3
    const v0, -0x3799f46e

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子苏楪世兰哲(I)Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2, p0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x4

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    :goto_0
    or-int/2addr v0, p3

    .line 19
    invoke-virtual {p2, p1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    const/16 v1, 0x20

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/16 v1, 0x10

    .line 29
    .line 30
    :goto_1
    or-int/2addr v0, v1

    .line 31
    and-int/lit8 v1, v0, 0x13

    .line 32
    .line 33
    const/16 v2, 0x12

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x1

    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    move v1, v4

    .line 40
    goto :goto_2

    .line 41
    :cond_2
    move v1, v3

    .line 42
    :goto_2
    and-int/2addr v0, v4

    .line 43
    invoke-virtual {p2, v0, v1}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世哲兰楪苏(IZ)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-static {p0, p1}, Landroidx/compose/ui/draw/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲兰苏(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)V

    .line 54
    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子世兰楪哲苏()V

    .line 58
    .line 59
    .line 60
    :goto_3
    invoke-virtual {p2}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪哲兰苏世()Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;

    .line 67
    .line 68
    invoke-direct {v0, p3, v3, p0, p1}, Landroidx/compose/foundation/飘花落叶言子楪兰苏世哲;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iput-object v0, p2, Landroidx/compose/runtime/飘花落叶言子苏哲兰世楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲苏兰世;

    .line 72
    .line 73
    :cond_4
    return-void
.end method

.method public static 飘花落叶言子楪哲世兰苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/飘花落叶言子哲世楪兰苏;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 8

    .line 1
    sget-object v2, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    iget-object v5, p1, Landroidx/compose/foundation/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪世哲兰苏:Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;

    .line 4
    .line 5
    sget-object v0, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 6
    .line 7
    sget-object v1, Landroidx/compose/foundation/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/飘花落叶言子世兰楪哲苏;

    .line 8
    .line 9
    invoke-static {v0, v1}, Landroidx/compose/ui/draw/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子哲世苏楪兰;

    .line 18
    .line 19
    const/4 v6, 0x1

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v3, 0x1

    .line 22
    const/4 v4, 0x0

    .line 23
    move-object v1, p1

    .line 24
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/飘花落叶言子哲世苏楪兰;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/飘花落叶言子苏楪世兰哲;Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;ZLandroidx/compose/foundation/飘花落叶言子苏兰楪世哲;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子哲世兰楪苏;

    .line 32
    .line 33
    invoke-direct {p1, v1}, Landroidx/compose/foundation/飘花落叶言子哲世兰楪苏;-><init>(Landroidx/compose/foundation/飘花落叶言子哲世楪兰苏;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, p1}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static final 飘花落叶言子楪哲世苏兰(FJ)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p1, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    sub-float/2addr v1, p0

    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-static {v2, v1}, Ljava/lang/Math;->max(FF)F

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    const-wide v3, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    and-long/2addr p1, v3

    .line 22
    long-to-int p1, p1

    .line 23
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    sub-float/2addr p1, p0

    .line 28
    invoke-static {v2, p1}, Ljava/lang/Math;->max(FF)F

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    int-to-long p1, p1

    .line 37
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    int-to-long v1, p0

    .line 42
    shl-long p0, p1, v0

    .line 43
    .line 44
    and-long v0, v1, v3

    .line 45
    .line 46
    or-long/2addr p0, v0

    .line 47
    return-wide p0
.end method

.method public static 飘花落叶言子楪苏世兰哲(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;Landroidx/compose/foundation/飘花落叶言子世兰哲苏楪;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 2

    .line 1
    instance-of v0, p1, Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;

    .line 6
    .line 7
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;

    .line 8
    .line 9
    invoke-direct {v0, p1, p0, p3, p2}, Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;-><init>(Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 10
    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_1

    .line 15
    .line 16
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;

    .line 17
    .line 18
    invoke-direct {p1, v0, p0, p3, p2}, Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;-><init>(Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :cond_1
    sget-object v1, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    invoke-static {v1, p0, p1}, Landroidx/compose/foundation/飘花落叶言子苏楪世兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰世哲;Landroidx/compose/foundation/飘花落叶言子世兰哲苏楪;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-instance v1, Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;

    .line 31
    .line 32
    invoke-direct {v1, v0, p0, p3, p2}, Landroidx/compose/foundation/飘花落叶言子世楪苏兰哲;-><init>(Landroidx/compose/foundation/飘花落叶言子苏楪兰哲世;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 33
    .line 34
    .line 35
    invoke-interface {p1, v1}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_2
    new-instance p0, Landroidx/compose/foundation/飘花落叶言子楪兰哲世苏;

    .line 41
    .line 42
    invoke-direct {p0, p1, p3, p2}, Landroidx/compose/foundation/飘花落叶言子楪兰哲世苏;-><init>(Landroidx/compose/foundation/飘花落叶言子世兰哲苏楪;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 43
    .line 44
    .line 45
    invoke-static {v1, p0}, Landroidx/compose/ui/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪哲兰世苏;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public static 飘花落叶言子楪苏世哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;ZLjava/lang/String;Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;I)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 2

    .line 1
    and-int/lit8 v0, p5, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    :cond_0
    and-int/lit8 v0, p5, 0x2

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    move-object p2, v1

    .line 12
    :cond_1
    and-int/lit8 p5, p5, 0x8

    .line 13
    .line 14
    if-eqz p5, :cond_2

    .line 15
    .line 16
    move-object p3, v1

    .line 17
    :cond_2
    new-instance p5, Landroidx/compose/foundation/飘花落叶言子楪兰苏哲世;

    .line 18
    .line 19
    invoke-direct {p5, p3, p1, p2, p4}, Landroidx/compose/foundation/飘花落叶言子楪兰苏哲世;-><init>(Landroidx/compose/foundation/interaction/飘花落叶言子楪苏兰哲世;ZLjava/lang/String;L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;)V

    .line 20
    .line 21
    .line 22
    invoke-interface {p0, p5}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏兰世哲(Landroidx/compose/runtime/飘花落叶言子楪苏哲世兰;)Z
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/platform/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子楪兰世苏哲;

    .line 2
    .line 3
    check-cast p0, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroidx/compose/runtime/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Landroid/content/res/Configuration;

    .line 10
    .line 11
    iget p0, p0, Landroid/content/res/Configuration;->uiMode:I

    .line 12
    .line 13
    and-int/lit8 p0, p0, 0x30

    .line 14
    .line 15
    const/16 v0, 0x20

    .line 16
    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const/4 p0, 0x1

    .line 20
    return p0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0
.end method

.method public static 飘花落叶言子楪苏兰哲世(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/foundation/lazy/飘花落叶言子世楪苏哲兰;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/飘花落叶言子苏兰楪世哲;ZLandroidx/compose/foundation/gestures/飘花落叶言子苏楪世兰哲;Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 8

    .line 1
    sget-object v0, Landroidx/compose/foundation/gestures/Orientation;->Vertical:Landroidx/compose/foundation/gestures/Orientation;

    .line 2
    .line 3
    sget-object v1, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 4
    .line 5
    if-ne p2, v0, :cond_0

    .line 6
    .line 7
    sget-object v0, Landroidx/compose/foundation/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世哲苏兰:Landroidx/compose/foundation/飘花落叶言子世兰楪哲苏;

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroidx/compose/ui/draw/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    sget-object v0, Landroidx/compose/foundation/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/飘花落叶言子世兰楪哲苏;

    .line 15
    .line 16
    invoke-static {v1, v0}, Landroidx/compose/ui/draw/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :goto_0
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    new-instance v0, Landroidx/compose/foundation/飘花落叶言子哲世苏楪兰;

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    move-object v1, p1

    .line 28
    move-object v2, p2

    .line 29
    move-object v7, p3

    .line 30
    move v3, p4

    .line 31
    move-object v4, p5

    .line 32
    move-object v5, p6

    .line 33
    invoke-direct/range {v0 .. v7}, Landroidx/compose/foundation/飘花落叶言子哲世苏楪兰;-><init>(Landroidx/compose/foundation/gestures/飘花落叶言子哲苏世楪兰;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/飘花落叶言子苏楪世兰哲;Landroidx/compose/foundation/interaction/飘花落叶言子楪哲世苏兰;ZLandroidx/compose/foundation/飘花落叶言子苏兰楪世哲;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p0, v0}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲世兰(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;Z)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance p1, Landroidx/compose/foundation/飘花落叶言子世苏兰哲楪;

    .line 4
    .line 5
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object p1, Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/ui/飘花落叶言子楪哲世苏兰;

    .line 10
    .line 11
    :goto_0
    invoke-interface {p0, p1}, Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰世哲苏(Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;)Landroidx/compose/ui/飘花落叶言子楪哲苏兰世;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static final 飘花落叶言子楪苏哲兰世(Landroid/view/KeyEvent;)Z
    .locals 4

    .line 1
    invoke-static {p0}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏兰哲(Landroid/view/KeyEvent;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    sget p0, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲兰楪苏:I

    .line 6
    .line 7
    sget-wide v2, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世兰哲:J

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    sget-wide v2, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰苏世:J

    .line 16
    .line 17
    invoke-static {v0, v1, v2, v3}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-nez p0, :cond_1

    .line 22
    .line 23
    sget-wide v2, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子世苏楪哲兰:J

    .line 24
    .line 25
    invoke-static {v0, v1, v2, v3}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-nez p0, :cond_1

    .line 30
    .line 31
    sget-wide v2, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:J

    .line 32
    .line 33
    invoke-static {v0, v1, v2, v3}, L飘花落叶言子世兰哲楪苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(JJ)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-eqz p0, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 p0, 0x0

    .line 41
    return p0

    .line 42
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 43
    return p0
.end method
